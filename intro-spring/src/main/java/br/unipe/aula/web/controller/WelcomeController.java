package br.unipe.aula.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
	
	@RequestMapping(value = "/teste", method = RequestMethod.GET)
	public String welcome() {
		return "welcome";
	}

	public Integer retornaNumero () {
		return 10 ;
	}

	public String retornaTexto() {
		return "texto texto";
	}

	public Boolean retornBoolean() {
		return true;
	}

}
