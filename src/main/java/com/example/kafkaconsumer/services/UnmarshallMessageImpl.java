package com.example.kafkaconsumer.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

@Service
public class UnmarshallMessageImpl<T> implements UnmarshallMessage<T>{

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public T fromJson(String message, Class<T> tClass) throws JsonProcessingException {
        return null;
    }
}
