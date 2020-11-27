package com.prueba.libro.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Libro - Model", description = "Entidad para administrar los libros")
public class libroModel {

	@ApiModelProperty(notes = "Identificación del objeto", required = true)
	private Long id;
	@ApiModelProperty(notes = "nombre del libro")
	private String nombre;
	@ApiModelProperty(notes = "nombre del autor")
	private String autor;
	@ApiModelProperty(notes = "fecha de publicacion")
	private String fechaPublicacion;
	@ApiModelProperty(notes = "valor del libro")
	private double valor;
	@ApiModelProperty(notes = "Disponibilidad del libro")
	private boolean disponible;

	public libroModel(Long id, String nombre, String autor, String fechaPublicacion, double valor, boolean disponible) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.autor = autor;
		this.fechaPublicacion = fechaPublicacion;
		this.valor = valor;
		this.disponible = disponible;
	}
	
	

	public libroModel() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getAutor() {
		return autor;
	}

	public String getFechaPublicacion() {
		return fechaPublicacion;
	}

	public double getValor() {
		return valor;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setFechaPublicacion(String fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

}
