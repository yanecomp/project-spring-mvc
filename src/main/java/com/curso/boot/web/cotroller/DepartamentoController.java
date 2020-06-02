package com.curso.boot.web.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.curso.boot.domain.Departamento;
import com.curso.boot.service.DepartamentoService;


@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {
	
	@Autowired
	private DepartamentoService service;
	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("departamentos", service.buscarTodos());
		return "/departamento/lista";
	}
	
	@GetMapping("/cadastrar")
	public String cadastrar(Departamento departamento) {
		return "/departamento/cadastro";
	}
	
	@PostMapping("/salvar")
	public String salvar(Departamento departamento) {
		service.salvar(departamento);
		return "redirect:/departamentos/cadastrar";
	}

}
