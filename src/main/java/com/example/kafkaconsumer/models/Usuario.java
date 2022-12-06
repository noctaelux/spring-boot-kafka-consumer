package com.example.kafkaconsumer.models;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Usuario {

    private String nombre;
    private String apellidos;
    private Date fechaNacimiento;
    private List<String> observaciones;
    private Direccion direccion;

}
