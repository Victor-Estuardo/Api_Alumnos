package com.api.simulacro.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.simulacro.Dao.IDaoAlumnos;
import com.api.simulacro.Entity.Alumnos;

@RestController
@RequestMapping(value = ("/simulacro"))
public class AlumnoController {

    @Autowired
    private IDaoAlumnos daoAlumnos;

    @GetMapping(value = "/alumnos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Alumnos> getClientes() {
		return daoAlumnos.findAll();
	}
	
	@PostMapping(value = "/alumnos", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Alumnos saveCliente(@RequestBody Alumnos cliente) {
		return daoAlumnos.save(cliente);
	}

	@PutMapping(value = "/alumnos", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Alumnos update(@RequestBody Alumnos cliente){
		return daoAlumnos.update(cliente);
	}
}
