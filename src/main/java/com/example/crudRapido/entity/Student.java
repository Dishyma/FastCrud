package com.example.crudRapido.entity;

import jakarta.persistence.*;
import lombok.Data;

//Con @Data nos evita el hecho de crear los set y los get
@Data

//Con @entity nos permite manejar la persistencia
@Entity

//Con @Table podemos crear las tablas
@Table(name = "tbl_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentId;

    //@Column nos permite crear los columnas, le podemos anadir las propiedades
    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

}
