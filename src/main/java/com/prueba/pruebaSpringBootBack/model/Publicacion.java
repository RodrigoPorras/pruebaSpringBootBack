package com.prueba.pruebaSpringBootBack.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "publicaciones")
@Access(AccessType.FIELD)
public class Publicacion extends ParentEntity {

	private static final long serialVersionUID = -6524920888087529498L;
	
	@Column(name = "titulo",nullable=false,length=255)
	private String titulo;
	
	@Column(name = "contenido",nullable=false)
	private String contenido;
	
	@Column(name = "link_imagen",nullable=true,length=255)
	private String linkImagen;
	
	@Column(name = "fecha_publicacion")
	private String fechaPublicacion; 
	
	@Column(name = "link",nullable=true)
	private String link;
	
	@Column(name = "precio",nullable=true)
	private String precio;
	
	@Column(name = "tipo_publicacion",nullable=false)
	private String tipoPublicacion;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public String getLinkImagen() {
		return linkImagen;
	}
	public void setLinkImagen(String linkImagen) {
		this.linkImagen = linkImagen;
	}
	public String getFechaPublicacion() {
		return fechaPublicacion;
	}
	public void setFechaPublicacion(String fechaPublicación) {
		this.fechaPublicacion = fechaPublicación;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getTipoPublicacion() {
		return tipoPublicacion;
	}
	public void setTipoPublicacion(String tipoPublicacion) {
		this.tipoPublicacion = tipoPublicacion;
	}
	
}
