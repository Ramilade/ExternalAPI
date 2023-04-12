package com.example.apiex1.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
public class Nationality {
  List<Country> country;
  String name;

  @Override
  public String toString() {
    return "Nationality{" +
        "country=" + country +
        ", name='" + name + '\'' +
        '}';
  }
}
