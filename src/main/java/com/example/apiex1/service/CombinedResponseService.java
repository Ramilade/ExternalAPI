package com.example.apiex1.service;

import com.example.apiex1.dto.CombinedResponse;
import com.example.apiex1.entity.Age;
import com.example.apiex1.entity.Gender;
import com.example.apiex1.entity.Nationality;
import com.example.apiex1.repository.CombinedResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CombinedResponseService {

    @Autowired
    private CombinedResponseRepository combinedResponseRepository;

    public void saveCombinedResponse(Gender g, Age a, Nationality n){
        CombinedResponse response = new CombinedResponse(g,a,n);
        combinedResponseRepository.save(response);
    }
}