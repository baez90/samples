using System.Collections.Generic;
using CustomSerializerAPI.Converters;
using Newtonsoft.Json;

namespace CustomSerializerAPI.Models
{
    [JsonConverter(typeof(ValueDtoConverter))]
    public class ValueDto
    {
        public ModelType Type { get; set; }
        public IList<IModel> Values { get; set; }
    }
}