package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public String sendMessage(){
        return "Hello, welcome to azure";
    }
}
