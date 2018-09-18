package com.prueba.pruebaSpringBootBack.service;

import java.util.List;

import com.prueba.pruebaSpringBootBack.model.Publicacion;

public interface PublicacionService {

	Publicacion save(Publicacion publicacion);

	List<Publicacion> FindAll();
}
