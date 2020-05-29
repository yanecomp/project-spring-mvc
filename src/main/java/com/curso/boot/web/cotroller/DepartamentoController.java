package com.curso.boot.web.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {
	
	@GetMapping("/listar")
	public String listar() {
		return "/departamento/lista";
	}
	
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/departamento/cadastro";
	}

}
