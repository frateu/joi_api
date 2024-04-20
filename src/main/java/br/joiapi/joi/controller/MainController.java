package br.joiapi.joi.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MainController {
	@GetMapping("/")
	public String homeTest() {
		return "Home Test!";
	}
}
