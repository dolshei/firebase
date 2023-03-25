package com.example.firebase.controller;

import com.example.firebase.config.properties.FirebaseProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/properties")
@RequiredArgsConstructor
public class PropertiesController {

    private final FirebaseProperties properties;

    @GetMapping("/firebase")
    @ResponseBody
    public FirebaseProperties readProperty() {
        return properties;
    }
}
