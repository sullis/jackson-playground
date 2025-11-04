package io.github.sullis.playground.jackson;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JacksonHelperTest {

  @Test
  void happyPath() throws Exception {
    var helper = new JacksonHelper();
    var bean = new SimpleBean();
    var json = helper.toJsonString(bean);
    var bean2 = helper.fromJsonString(json, SimpleBean.class);

    assertThat(bean2.count).isEqualTo(10);
    assertThat(bean2.animal).isEqualTo("frog");
  }

  static class SimpleBean {
    public int count = 10;
    public String animal = "frog";
  }
}