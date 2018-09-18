package com.prueba.pruebaSpringBootBack.controllers;

import java.io.IOException;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.prueba.pruebaSpringBootBack.model.Publicacion;
import com.prueba.pruebaSpringBootBack.service.PublicacionService;
import com.prueba.pruebaSpringBootBack.util.RestResponse;

@RestController
public class PublicacionController {

	@Autowired
	protected PublicacionService publicacionService;
	
	protected ObjectMapper mapper;
	
	@RequestMapping(value ="/saveOrUpdate", method = RequestMethod.POST)
	public RestResponse saveOrUpdate(@RequestBody String publicacionJson) 
			throws JsonParseException, JsonMappingException, IOException{
		
		this.mapper = new ObjectMapper();
		Publicacion publicacion = this.mapper.readValue(publicacionJson, Publicacion.class);
		
		if(!validate(publicacion)){
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),"Los campos obligatorios no estan diligenciados");
		}
		
		this.publicacionService.save(publicacion);
		return new RestResponse(HttpStatus.OK.value(),"Operacion Exitosa");
	}
	
	@RequestMapping(value ="/getPublicaciones", method = RequestMethod.GET)
	public List<Publicacion> getPublicaciones(){
		return this.publicacionService.FindAll();
	}
	
	@RequestMapping(value ="/deletePublicacion", method = RequestMethod.POST)
	public void deletePublicacion(@RequestBody String publicacionJson) 
			throws JsonParseException, JsonMappingException, IOException,Exception{
		this.mapper = new ObjectMapper();
		
		Publicacion publicacion = this.mapper.readValue(publicacionJson, Publicacion.class);
		
		if(publicacion.getId() == null){
			throw new Exception("El Id está nulo");
		}
		this.publicacionService.deletePubliacion(publicacion.getId());
	}
	
	private boolean validate(Publicacion publicacion){
		boolean isValid = true;
		if(StringUtils.trimToNull(publicacion.getTitulo())== null){
			isValid = false;
			System.out.println("titulo false");
		}
		if(StringUtils.trimToNull(publicacion.getContenido())== null){
			isValid = false;
			System.out.println("getContenido false");
		}
		
		if(StringUtils.trimToNull(publicacion.getFechaPublicación())== null){
			isValid = false;
			System.out.println("getFechaPublicación false");
		}
		if(StringUtils.trimToNull(publicacion.getTipoPublicacion())== null){
			isValid = false;
			System.out.println("getTipoPublicacion false");
		}
		
		return isValid;
	}
}
