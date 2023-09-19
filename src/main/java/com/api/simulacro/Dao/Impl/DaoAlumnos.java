package com.api.simulacro.Dao.Impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.api.simulacro.Dao.IDaoAlumnos;
import com.api.simulacro.Entity.Alumnos;

@Repository
@Transactional
public class DaoAlumnos implements IDaoAlumnos {

    @PersistenceContext
    private EntityManager em;

    @Transactional(readOnly = true)
    @Override
    public List<Alumnos> findAll() {
        try {
            List<Alumnos> listaAlumnos = em.createQuery("FROM Alumnos", Alumnos.class).getResultList();
            return listaAlumnos;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Alumnos save(Alumnos alumno) {
        try {
            em.persist(alumno);
            return alumno;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Alumnos update(Alumnos alumno) {
        try {
            em.merge(alumno);
            return alumno;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
