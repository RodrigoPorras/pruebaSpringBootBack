package com.prueba.pruebaSpringBootBack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
	
	@RequestMapping("/")
	public String getIndexPage(){
		return "index";
	}
}
