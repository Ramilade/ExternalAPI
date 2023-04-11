package com.example.apiex1.api;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
class Gender {
    String gender;
    String name;
    int count;
    double probability;

    @Override
    public String toString() {
        return "Gender{" +
                "gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", probability=" + probability +
                '}';
    }
}
