package com.archivos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.archivos.model.Archivo;
import com.archivos.service.ArchivoService;

@RestController
@RequestMapping("/archivos")
public class ArchivoController {

	@Autowired
	private ArchivoService archivoService;
	
	/***********************************************METODOS CRUD******************************************************/
	@GetMapping
	public List<Archivo> listarArchivos(){
		return archivoService.obtenerArchivos();
	}
	
	
	@GetMapping("/{id}")
	public Archivo obtenerArchivoPorId(@PathVariable(name = "id") Long id) {
		return archivoService.obtenerArchivoPorId(id);
	}
	
	@PostMapping
	public void guardarArchivo(@RequestBody Archivo archivo) {
		archivoService.subirArchivo(archivo);
	}
	
	@PutMapping("/{id}")
	public void actualizarArchivo(@RequestBody Archivo archivo, @PathVariable(name = "id") Long id) {
		archivoService.actualizarArchivo(id, archivo);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarArchivo(@PathVariable(name = "id") Long id) {
		archivoService.eliminarArchivo(id);
	}
	
}
