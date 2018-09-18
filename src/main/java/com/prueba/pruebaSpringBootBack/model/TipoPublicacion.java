package com.prueba.pruebaSpringBootBack.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_publicacion")
@Access(AccessType.FIELD)
public class TipoPublicacion  extends ParentEntity  {

	private static final long serialVersionUID = 18205629251847832L;
	
	@Column(name = "descripcion",nullable=false)
	private String descripcion;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
