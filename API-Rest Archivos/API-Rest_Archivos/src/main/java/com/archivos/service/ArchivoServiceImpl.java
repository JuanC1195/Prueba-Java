package com.archivos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.archivos.model.Archivo;
import com.archivos.repository.ArchivoRepository;

@Service
public class ArchivoServiceImpl implements ArchivoService{

	@Autowired
	private ArchivoRepository archivoRepository; 
	
	@Override
	public void subirArchivo(Archivo archivo) {
		archivoRepository.save(archivo); //guardo el archivo en la bd
	}

	@Override
	public List<Archivo> obtenerArchivos() {
		return archivoRepository.findAll(); //obtener todos los archivo
	}

	@Override
	public Archivo obtenerArchivoPorId(Long Id) {
		return archivoRepository.findById(Id).orElse(null); //obtener un archivo por id
	}

	@Override
	public void actualizarArchivo(Long Id, Archivo archivo) {
		Archivo archivoA = archivoRepository.findById(Id).orElse(null); //busco el archico por id, si no lo encuentro retorno un null
		archivoA.setNombre(archivo.getNombre());
		archivoA.setDescripcion(archivo.getDescripcion());
		archivoA.setDocumento(archivo.getDocumento()); // actualizo los datos
		archivoRepository.save(archivoA); //guardo cambios
	}

	@Override
	public void eliminarArchivo(Long Id) {
		Archivo archivo = archivoRepository.findById(Id).orElse(null); //busco el archico por id, si no lo encuentro retorno un null
		archivoRepository.delete(archivo); //Elimino archivo
	}
	
}
