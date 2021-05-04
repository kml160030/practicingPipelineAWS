package com.revature.controllers;

import com.revature.models.PracticeUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.revature.services.PracticeService;

@RestController
@RequestMapping("/users")
public class PracticeController {

    private PracticeService practiceService;

    @Autowired
    public PracticeController(PracticeService practiceService){
        this.practiceService = practiceService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void registerUser(@RequestBody PracticeUser practiceUser) {
        practiceService.register(practiceUser);
    }
}
