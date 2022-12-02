package com.example.kafkaconsumer.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

@Service
public class UnmarshallMessageImpl<T> implements UnmarshallMessage<T>{

    Class<T> tClass;

    private ObjectMapper objectMapper = new ObjectMapper();

    public UnmarshallMessageImpl(Class<T> tClass){
        this.tClass = tClass;
    }

    @Override
    public T fromJson(String message) throws JsonProcessingException {
        return objectMapper.readValue(message,tClass);
    }
}
