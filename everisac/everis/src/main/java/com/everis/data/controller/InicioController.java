package com.everis.data.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class InicioController {

	@RequestMapping("/")
	public String inicio() {
		return "index.jsp";
	}
	
	//pasar parametro desde el back al front. SIempre incluir la clase Model para esto.
	@RequestMapping("/clase")
	public String pagina1(Model model) {
		model.addAttribute("parametro1", "66");
		return "index.jsp";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam(value="email") String email, @RequestParam(value="password") String password ) {
		System.out.println("Parametros recibidos: " + email + " Password : " +password);
		return "index.jsp";
	}
}
