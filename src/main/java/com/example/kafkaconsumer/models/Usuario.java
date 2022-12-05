package com.example.kafkaconsumer.models;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class Usuario {

    private String nombre;
    private String apellidos;
    private Date fechaNacimiento;
    private Direccion direccion;

}
