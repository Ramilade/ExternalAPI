package com.example.apiex1.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Age {
  int age;
  int count;
  String name;

  @Override
  public String toString() {
    return "Age{" +
        "age=" + age +
        ", count=" + count +
        ", name='" + name + '\'' +
        '}';
  }
}
