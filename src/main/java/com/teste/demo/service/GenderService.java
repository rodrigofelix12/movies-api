package com.teste.demo.service;

import com.teste.demo.model.Gender;
import com.teste.demo.repository.GenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenderService {

    @Autowired
    private GenderRepository genderRepository;

    public List<Gender> getGenders() {
        return genderRepository.findAll();
    }
}
