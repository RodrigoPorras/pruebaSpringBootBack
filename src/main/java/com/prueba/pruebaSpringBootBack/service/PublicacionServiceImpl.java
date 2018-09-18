package com.prueba.pruebaSpringBootBack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.pruebaSpringBootBack.dao.PublicacionRepository;
import com.prueba.pruebaSpringBootBack.model.Publicacion;

@Service
public class PublicacionServiceImpl implements PublicacionService {
	
	@Autowired
	protected PublicacionRepository publicacionRepository;

	@Override
	public Publicacion save(Publicacion publicacion) {
		return this.publicacionRepository.save(publicacion);
	}

	@Override
	public List<Publicacion> FindAll() {
		return this.publicacionRepository.findAll();
	}
}
