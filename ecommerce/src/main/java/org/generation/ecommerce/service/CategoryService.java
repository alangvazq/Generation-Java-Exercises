package org.generation.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.generation.ecommerce.model.Categoria;
import org.generation.ecommerce.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
	public final CategoryRepository categoryRepository;
	
	@Autowired
	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	public List<Categoria> getAllCategorias() {
		return categoryRepository.findAll();
	}

	public Categoria getCategoria(Long id) {
		return categoryRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("La categoria con el id [" + id + "] no existe"));
	}

	public Categoria deleteCategoria(Long id) {
		Categoria tmpCategoria = null;
		if (categoryRepository.existsById(id)) {
			tmpCategoria = categoryRepository.findById(id).get();
			categoryRepository.deleteById(id);
		}
		return tmpCategoria;
	}

	public Categoria addCategoria(Categoria categoria) {
		Optional<Categoria> tmpCategoria = categoryRepository.findByNombre(categoria.getNombre());
		if(tmpCategoria.isEmpty()) {
			return categoryRepository.save(categoria);
		}else {
			System.out.println("La categoria con el nombre [] ya existe");
			return null;
		}//else
	}

	public Categoria updateProducto(Long id, String nombre, String descripcion) {
		Categoria tmpCategoria=null;
		if (categoryRepository.existsById(id)) {
			Categoria categoria=categoryRepository.findById(id).get();
			if(nombre != null) categoria.setNombre(nombre);
			if(descripcion != null) categoria.setDescripcion(descripcion);
			categoryRepository.save(categoria);
			tmpCategoria=categoria;
		}//if
	return tmpCategoria;
	}

}
