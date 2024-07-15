package org.generation.ecommerce;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.generation.ecommerce.model.Producto;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.containsString;

@SpringBootTest
@AutoConfigureMockMvc
class EcommerceApplicationTests {
	@Autowired 
	private MockMvc mockMvc; //Autogenerar Mvc
	
	private final String token = "Bearer: eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhbGFuQGdtYWlsLmNvbSIsInJvbGUiOiJ1c2VyIiwiaWF0IjoxNzIwNDU4ODg2LCJleHAiOjE3MjA0OTQ4ODZ9.sxYIS6elkXk6nABIx7f9THVpxhzZfucDEfcDQAjlXLg";
	
	@Test
	@DisplayName("Se prueba el GET del endpoint http://localhost:8080/api/productos/1")
	void pruebaGET() throws Exception {
		this.mockMvc.perform(get("/api/productos/2"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("crema2")));
		this.mockMvc.perform(get("/api/productos/4"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("crema4")));
	}
	
	@Test
	@DisplayName("Se prueba el Delete del endpoint http://localhost:8080/api/productos/1")
	@Disabled("Probado una vez, deshabilitado porque ya no existe el producto id 1")
	void pruebaDELETE() throws Exception {
		this.mockMvc.perform(delete("/api/productos/1")
				.header("Authorization", token))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("crema")));
	}//pruebaDelete

	@Test
	@DisplayName("Se prueba el Post del endpoint http://localhost:8080/api/productos/1")
	@Disabled("Probado una vez, deshabilitado porque ya existe el producto id 6")
	void pruebaPOST() throws Exception {
		Producto p=new Producto();
		p.setNombre("Crema6");
		p.setDescripcion("Para rostro");
		p.setImagen("crema6.png");
		p.setPrecio(500.95);
		
		this.mockMvc.perform(post("/api/productos/")
				.contentType(MediaType.APPLICATION_JSON)
				.content(asJsonString(p))
				.header("Authorization", token))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("Crema6")));
	}//pruebaPost
	
	private static String asJsonString(final Object obj) {
	    try {
	      return new ObjectMapper().writeValueAsString(obj);
	    } catch (Exception e) {
	      throw new RuntimeException(e);
	    }//catch
	 } // asJsonString
	
	@Test
	@DisplayName("Se prueba el Put del endpoint http://localhost:8080/api/productos/4")
	//@Disabled("Probado una vez, deshabilitado porque ya no existe el producto id 1")
	void pruebaPUT() throws Exception {
		this.mockMvc.perform(put("/api/productos/4")
				.queryParam("precio", "666.67")
				.queryParam("imagen", "crema666.png")
				.header("Authorization", token))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("666.67")));
	}//pruebaDelete
}
