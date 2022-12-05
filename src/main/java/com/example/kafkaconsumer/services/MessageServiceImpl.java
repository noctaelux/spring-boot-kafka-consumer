package com.example.kafkaconsumer.services;

import com.example.kafkaconsumer.models.Usuario;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {

    private static final Logger LOG = LoggerFactory.getLogger(MessageServiceImpl.class);

    private final UnmarshallMessage<Usuario> unmarshallMessage;

    @Override
    public void printMessage(String message) {
        Usuario usuario = null;
        try {
            usuario = unmarshallMessage.fromJson(message, Usuario.class);
        } catch (JsonProcessingException e) {
            LOG.error(e.getMessage());
        }
        assert usuario != null;
        LOG.info(usuario.toString());
    }
}
