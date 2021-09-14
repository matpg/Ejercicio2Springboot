package com.everis.data.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

	@RequestMapping("")
	public String pagina() {
		return "Clase Lunes pagina de inicio";
	}
	
	@RequestMapping("/estudiantes")
	public String estudiantes() {
		return "Lista de estudiantes";
	}
	
	@RequestMapping(value="/get", method = RequestMethod.GET )
	public String get() {
		return "Lista de estudiantes";
	}
	
}
