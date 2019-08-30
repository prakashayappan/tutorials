package com.baeldung.architecture.hexagonal.service;

import org.springframework.stereotype.Component;

@Component
public class SmsServiceImpl implements MessageService {

    @Override
    public boolean sendMessage(String message) {

        return false;
    }

}
