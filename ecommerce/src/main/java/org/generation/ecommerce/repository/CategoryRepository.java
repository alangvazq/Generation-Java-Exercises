package org.generation.ecommerce.repository;

import java.util.Optional;

import org.generation.ecommerce.model.Categoria;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepositoryImplementation<Categoria, Long>{
	Optional<Categoria> findByNombre(String nombre);
}
