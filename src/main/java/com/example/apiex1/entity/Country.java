package com.example.apiex1.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Country {
  String country_id;
  double probability;

  @Override
  public String toString() {
    return "Country{" +
        "id='" + country_id + '\'' +
        ", probability=" + probability +
        '}';
  }
}
