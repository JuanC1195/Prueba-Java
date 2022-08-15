package com.archivos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.archivos.model.Archivo;

public interface ArchivoRepository extends JpaRepository<Archivo, Long>{

}
