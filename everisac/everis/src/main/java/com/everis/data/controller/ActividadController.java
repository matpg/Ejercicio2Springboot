package com.everis.data.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ActividadController {

	@RequestMapping(value = "/formulario", method = RequestMethod.GET)
	public String formulario() {
		return "actividad.jsp";
	}

	@RequestMapping(value = "/formulario", method = RequestMethod.POST)
	public String inicio(@RequestParam("nombre") String nombre, @RequestParam("apellido") String apellido,
			@RequestParam("limite") String limite, @RequestParam("codigopostal") String codigopostal, Model model) {
		String mensajeNombre = "";
		String mensajeApellido = "";
		String mensajeLimite = "";
		String mensajeCodigopostal = "";

		if (nombre.isBlank() && nombre.isEmpty()) {
			mensajeNombre = "El nombre esta vacio";
			nombre = "";
		} else {
			if (nombre.length() < 0 || nombre.length() > 11) {
				mensajeNombre = "El nombre esta fuera del rango establecido (de 0 a 10 dígitos)";
				nombre = "";
			} else {
				mensajeNombre = "Nombre correcto";
			}
		}

		if (apellido.isBlank() && apellido.isEmpty()) {
			apellido = "";
			mensajeApellido = "El apellido esta vacio";
		} else {
			if (apellido.length() < 0 || apellido.length() > 11) {
				apellido = "";
				mensajeApellido = "El apellido esta fuera del rango establecido (de 0 a 10 dígitos)";
			} else {
				mensajeApellido = " Apellido correcto";
			}
		}

		if (limite.isBlank() && limite.isEmpty()) {
			limite = "";
			mensajeLimite = "El límite esta vacio";
		} else {
			if(Integer.parseInt(limite)>0) {
				if (limite.length() < 0 || limite.length() > 5) {
					limite = "";
					mensajeLimite = "El límite esta fuera del rango establecido (0 a 5 valores)";
				} else {
					mensajeLimite = " Límite correcto";
				}
			}else {
				limite = "";
				mensajeLimite = "El límite no puede ser negativo";
			}
			
		}

		if (codigopostal.isBlank() && codigopostal.isEmpty()) {
			codigopostal = "";
			mensajeCodigopostal = " El código postal esta vacio";
		} else {
			if (codigopostal.length() < 0 || codigopostal.length() > 9) {
				codigopostal = "";
				mensajeCodigopostal = " El código postal esta fuera del rango establecido (Debe tener solo 8 dígitos)";
			} else {
				mensajeCodigopostal = " Código Postal correcto";
			}
		}

		model.addAttribute("nombre", nombre);
		model.addAttribute("apellido", apellido);
		model.addAttribute("limite", limite);
		model.addAttribute("codigopostal", codigopostal);

		model.addAttribute("mensajeNombre", mensajeNombre);
		model.addAttribute("mensajeApellido", mensajeApellido);
		model.addAttribute("mensajeLimite", mensajeLimite);
		model.addAttribute("mensajeCodigopostal", mensajeCodigopostal);
		return "actividad.jsp";
	}

	// pasar parametro desde el back al front. SIempre incluir la clase Model para
	// esto.
	/*
	 * @RequestMapping("/clase") public String pagina1(Model model) {
	 * model.addAttribute("parametro1", "666"); return "index.jsp"; }
	 */
}
