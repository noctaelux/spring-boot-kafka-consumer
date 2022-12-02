package com.example.kafkaconsumer.services;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface UnmarshallMessage<T> {

    T fromJson(String message) throws JsonProcessingException;

}
