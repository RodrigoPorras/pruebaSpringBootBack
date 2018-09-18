package com.prueba.pruebaSpringBootBack.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.pruebaSpringBootBack.model.TipoPublicacion;


public interface TipoPublicacionRepository extends JpaRepository<TipoPublicacion, Long> {

}
