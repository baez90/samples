using System;
using System.Collections.Generic;
using System.Linq;
using CustomSerializerAPI.Models;
using Newtonsoft.Json;
using Newtonsoft.Json.Linq;
using Newtonsoft.Json.Serialization;

namespace CustomSerializerAPI.Converters
{
    public class ValueDtoConverter : JsonConverter<ValueDto>
    {
        public override void WriteJson(JsonWriter writer, ValueDto value, JsonSerializer serializer)
        {
            throw new NotImplementedException();
        }

        public override ValueDto ReadJson(JsonReader reader, Type objectType, ValueDto existingValue,
            bool hasExistingValue, JsonSerializer serializer)
        {
            if (existingValue == null)
            {
                existingValue = new ValueDto();
            }

            dynamic valuesProxy = null;

            // The problem here is the order of the properties
            // if the values node comes before the type node it is not possible to deserialize them but it is also impossible to reset the reader
            while (reader.Read())
            {
                switch (reader.Path)
                {
                    case "type":
                        var type = reader.ReadAsString();
                        existingValue.Type = Enum.Parse<ModelType>(type, true);
                        break;
                    case "values":
                        reader.Read();
                        valuesProxy = serializer.Deserialize<dynamic>(reader);
                        break;
                }
            }

            if (valuesProxy != null)
            {
                try
                {
                    JToken token = valuesProxy;
                    switch (existingValue.Type)
                    {
                        case ModelType.Cart:
                            existingValue.Values = token.
                                ToObject<List<Cart>>().
                                Cast<IModel>().
                                ToList();
                            break;
                        case ModelType.Customer:
                            existingValue.Values = token.
                                ToObject<List<Customer>>().
                                Cast<IModel>().
                                ToList();
                            break;
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e);
                    throw;
                }
            }

            return existingValue;
        }
    }
}