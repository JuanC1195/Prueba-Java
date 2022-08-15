package com.aplicacion.java.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.aplicacion.java.Service.UsuarioService;

@Controller
public class RegistroController {
	/*
	 * Modelo Vista-Controlador para iniciar sesion
	 */
	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("/login")
	public String iniciarSesion() {
		return "login";
	}
	
	@GetMapping("/")
	public String verPaginaDeInicio(Model model) {
		model.addAttribute("usuarios",usuarioService.listarUsuarios());
		return "index";
	}
	
}
