package com.dev.plano.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GreetingsController {

	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String greeting(String name, Model model) {
		model.addAttribute("message", this.message);
		return "welcome";
	}
}
