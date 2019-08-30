package com.baeldung.architecture.hexagonal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baeldung.architecture.hexagonal.service.MessageService;

@RestController
@RequestMapping("message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("send")
    public ResponseEntity<Boolean> sendAMessage(String message) {
        return ResponseEntity.ok(messageService.sendMessage(message));
    }
}
