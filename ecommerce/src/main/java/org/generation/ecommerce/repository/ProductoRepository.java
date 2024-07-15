package org.generation.ecommerce.repository;

import java.util.Optional;

import org.generation.ecommerce.model.Producto;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductoRepository extends JpaRepositoryImplementation<Producto, Long> {
	Optional<Producto> findByNombre(String nombre);
	Optional<Producto> findByPrecio(Double precio);

}
