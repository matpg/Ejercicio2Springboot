package com.everis.data.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParametrosController {

	@RequestMapping("/parametro2" )
	public String inicio(@RequestParam(value="x", required=false) String parametro) {
		return "Parametro2 "  + parametro;
	}
	
	@RequestMapping("/parametro3/{valor}" )
	public String parametro3(@PathVariable("valor") String param) {
		return "Parametro3 "  + param; 
	}
}
