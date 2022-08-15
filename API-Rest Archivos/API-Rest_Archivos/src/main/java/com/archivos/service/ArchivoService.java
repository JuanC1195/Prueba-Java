package com.archivos.service;

import java.util.List;

import com.archivos.model.Archivo;

public interface ArchivoService {
	//Metodo para guardar archivos
	public void subirArchivo(Archivo archivo);
	//Metodo para obtener todos los archivos
	public List<Archivo> obtenerArchivos();
	//Metodo para obtener un archivo por id
	public Archivo obtenerArchivoPorId(Long Id);
	//Metodo para actualizar un parametro de un archivo
	public void actualizarArchivo(Long Id, Archivo archivo);
	//Metodo para eliminar un archivo
	public void eliminarArchivo(Long Id);
	
}
