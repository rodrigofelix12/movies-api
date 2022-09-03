package com.teste.demo.controller;

import com.teste.demo.model.Gender;
import com.teste.demo.service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/genders")
public class GenderController {

    @Autowired
    private GenderService genderService;

    @GetMapping
    public List<Gender> getGenders() {
        return genderService.getGenders();
    }
}
