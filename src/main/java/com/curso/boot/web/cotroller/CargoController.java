package com.curso.boot.web.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cargos")
public class CargoController {
	
	@GetMapping("/listar")
	public String listar() {
		return "/cargo/lista";
	}
	
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/cargo/cadastro";
	}

}
