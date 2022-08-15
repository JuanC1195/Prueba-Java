package com.archivos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "archivo")
public class Archivo {
/*
 * Se creo la entidad archivo donde se guardara la informacion, al mismo tiempo, se crea la tabla "archivo" en la db con las columnas
 * establecidas
 * */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Se genera el id de manera automatica y unica
	private Long id;

	@Column(name = "nombre")
	private String nombre;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "documento")
	private String documento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Archivo(Long id, String nombre, String descripcion, String documento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.documento = documento;
	}

	public Archivo() {
		super();
	}

}