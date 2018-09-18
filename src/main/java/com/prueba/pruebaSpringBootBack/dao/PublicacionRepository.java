package com.prueba.pruebaSpringBootBack.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.pruebaSpringBootBack.model.Publicacion;

public interface PublicacionRepository extends JpaRepository<Publicacion, Long> {
	
	@SuppressWarnings("unchecked")
	Publicacion save(Publicacion publicacion) ;
	
}
