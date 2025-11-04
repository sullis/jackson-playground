package io.github.sullis.playground.jackson;

import tools.jackson.core.JacksonException;
import tools.jackson.databind.ObjectMapper;

public class JacksonHelper {
  private ObjectMapper mapper;

  public JacksonHelper() {
    mapper = new ObjectMapper();
  }

  public String toJsonString(Object object) throws JacksonException {
    return mapper.writeValueAsString(object);
  }

  public <T> T fromJsonString(String json, Class<T> valueType)
      throws JacksonException {
    return mapper.readValue(json, valueType);
  }
}
