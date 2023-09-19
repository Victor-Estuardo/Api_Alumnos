package com.api.simulacro.Dao;

import java.util.List;

import com.api.simulacro.Entity.Alumnos;

public interface IDaoAlumnos {
    public List<Alumnos> findAll();
    public Alumnos save(Alumnos cliente);
    public Alumnos update(Alumnos cliente);
}
