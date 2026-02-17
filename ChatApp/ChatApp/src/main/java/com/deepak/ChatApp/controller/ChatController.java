package com.deepak.ChatApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ChatController {
    public ChatMessage sendMessage(ChatMessage message){
        return message;
    }
}
