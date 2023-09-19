package com.api.simulacro.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "alumno")
public class Alumnos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_alumnos")
    private Long id_alumnos;
    
    private String nombre;
    private String apellido;
    private String sexo;
    private Date fecha_nac;
    private Integer tipo_persona;
    private Float sueldo;
    private String email;
    private Date fecha_crear;
    private String status;

}

