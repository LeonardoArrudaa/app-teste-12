package br.com.teste.app_teste_12;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class MainController {

	@GetMapping
	public String retornaHelloWorld() {
		return "Fala Fiote!";
	}
}
