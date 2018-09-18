package com.prueba.pruebaSpringBootBack.service;

import java.util.List;

import com.prueba.pruebaSpringBootBack.model.Publicacion;

public interface PublicacionService {

	/***
	 * Guarda una publicacion
	 * @param publicacion
	 * @return la publicacion guardada.
	 */
	Publicacion save(Publicacion publicacion);

	/**
	 * Recupera la lista de publicaciones
	 * @return lista de publicaciones
	 */
	List<Publicacion> FindAll();

	/**
	 * Elimina una publiacion con el id recibido
	 * @param id
	 */
	void deletePubliacion(Long id);
}
