package io.github.sullis.playground.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JacksonHelper {
  private ObjectMapper mapper;

  public JacksonHelper() {
    mapper = new ObjectMapper()
        .configure(SerializationFeature.INDENT_OUTPUT, true)
        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
  }

  public String toJsonString(Object object) throws JsonProcessingException {
    return mapper.writeValueAsString(object);
  }

  public <T> T fromJsonString(String json, Class<T> valueType)
      throws JsonProcessingException {
    return mapper.readValue(json, valueType);
  }
}
