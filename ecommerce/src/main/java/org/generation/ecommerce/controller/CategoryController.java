package org.generation.ecommerce.controller;

import java.util.List;

import org.generation.ecommerce.model.Categoria;
import org.generation.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/categorias/")
public class CategoryController {

	private final CategoryService categoryService;
	
	@Autowired
	public CategoryController (CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	@GetMapping
	public List<Categoria> getCategorias(){
		return categoryService.getAllCategorias();
	}
	
	@GetMapping(path = "{categoryId}")
	public Categoria getGCategoria(@PathVariable("categoryId") Long id) {
		return categoryService.getCategoria(id);	
	}
	
	@DeleteMapping(path = "{categoryId}")
	public Categoria deleteCategoria(@PathVariable("categoryId") Long id) {
		return categoryService.deleteCategoria(id);
	}
	
	@PostMapping //http://localhost:8080/api/productos/
	public Categoria addCategoria(@RequestBody Categoria categoria) {
		return categoryService.addCategoria(categoria);
	}
	
	@PutMapping(path="{categoryId}") //http://localhost:8080/api/productos/1
	public Categoria updateCategoria(@PathVariable("categoryId") Long id,
			@RequestParam(required=false) String nombre,
			@RequestParam(required=false) String descripcion) {
		return categoryService.updateProducto(id, nombre, descripcion);
	};
}
