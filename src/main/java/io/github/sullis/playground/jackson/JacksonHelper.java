package io.github.sullis.playground.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonHelper {
  private ObjectMapper mapper;

  public JacksonHelper() {
    mapper = new ObjectMapper();
  }

  public String toJsonString(Object object) throws JsonProcessingException {
    return mapper.writeValueAsString(object);
  }

  public <T> T fromJsonString(String json, Class<T> valueType)
      throws JsonProcessingException {
    return mapper.readValue(json, valueType);
  }
}
