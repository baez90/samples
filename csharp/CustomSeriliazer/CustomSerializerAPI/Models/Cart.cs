using System;
using System.Collections.Generic;

namespace CustomSerializerAPI.Models
{
    public class Cart : IModel
    {
        public Guid Id { get; set; }
        public List<string> Items { get; set; }
    }
}