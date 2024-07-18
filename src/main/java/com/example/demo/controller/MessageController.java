package com.example.demo.controller;

import com.example.demo.Repository.UserRepository;
import com.example.demo.entity.User;
import com.example.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @Autowired
    private MessageService messageService;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/sendSms")
    public String sendSMS(){
        return messageService.sendMessage();
    }
    @PostMapping("/addUser")
    String addUser(@RequestBody User user){
        userRepository.save(user);
        return "User added successfuly";
    }
}
