package org.generation.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Defina la clase como un controller
@RequestMapping(path="/api/saludos") // Ruta general 
public class PruebaController {
	// C-POST R-GET U-PUT D-DELETE
	
	//Ayuda a mapear la solicitud get que hagan al controlador hacia el hola mundo
	@GetMapping // Define la ruta para hacer el GET
	public String holaMundo() {
		return "Hola Mundo <strong>CH41</strong>";
	}
}
