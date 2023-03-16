package com.example.firebase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fcm/v1")
public class FCMPush {
    @GetMapping("/pushToken")
    String getPushObject(Model model) {
        model.addAttribute("something", "push use Token");
        return "pushToken";
    }
}
