package com.baeldung.architecture.hexagonal.service;

import java.util.logging.Logger;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailServiceImpl implements MessageService {

    Logger logger = Logger.getLogger(EmailServiceImpl.class.getName());

    @Override
    public boolean sendMessage(final String message) {

        logger.info(message);

        return true;
    }

}
