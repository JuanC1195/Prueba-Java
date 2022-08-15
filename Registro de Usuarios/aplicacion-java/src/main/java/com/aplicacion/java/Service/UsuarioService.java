package com.aplicacion.java.Service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.aplicacion.java.DTO.UsuarioRegistroDTO;
import com.aplicacion.java.model.Usuario;

public interface UsuarioService extends UserDetailsService{
	//Metodo para registrar un usuario
	public Usuario guardar(UsuarioRegistroDTO registroDTO);
	//Metodo para listar los usuarios
	public List<Usuario> listarUsuarios();
	
}
