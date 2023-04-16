package com.example.apiex1.dto;


import com.example.apiex1.entity.Age;
import com.example.apiex1.entity.Gender;
import com.example.apiex1.entity.Nationality;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class CombinedResponse {
  @Id
  @Column(name = "name")
  String name;
  String gender;
  double genderProbability;
  int age;
  int ageCount;
  String country;
  double countryProbability;

public CombinedResponse(Gender g, Age a, Nationality n){
  name = g.getName();
  gender =  g.getGender();
  genderProbability = g.getProbability();
  age = a.getAge();
  ageCount = a.getCount();
  country = n.getCountry().get(0).getCountry_id();
  countryProbability = n.getCountry().get(0).getProbability();

}

  @Override
  public String toString() {
    return "CombinedResponse{" +
        "name='" + name + '\'' +
        ", gender='" + gender + '\'' +
        ", genderProbability=" + genderProbability +
        ", age=" + age +
        ", ageCount=" + ageCount +
        ", country='" + country + '\'' +
        ", countryProbability=" + countryProbability +
        '}';
  }
}

