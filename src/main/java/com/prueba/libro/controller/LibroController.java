package com.prueba.libro.controller;


import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.prueba.libro.model.libroModel;
import com.prueba.libro.service.impl.libroService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/infoDocente")
@Api(tags = "Teacher Info Rest Controller", description = "Permite conocer el listado de profesores y su información básica")

public class LibroController {
	
	public static final String URL_CONTROLLER = "/disponibilidadDocente";

	@Autowired
	private libroService libroService ;
	
	@PostMapping
	public void create(@RequestBody libroModel dto) {
			libroService.create(dto);		
	}
	
	@ApiOperation(nickname = "showAllLibros", notes = "Este método obtiene todos los docente filtrados por el tipo de contrato y las muestra en forma de lista.", value = "Ver todas los docentes por un tipo de contrato", response = SimpleObjectResponse.class, produces = "application/json")
	@GetMapping("/showAllTeacherbyContract/{tipoContrato}")
	public libroModel showAllTeacherbyContract() {
		return (libroModel) libroService.showAll();
	}
	

}
