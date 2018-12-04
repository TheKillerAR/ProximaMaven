package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class ProvaSpring {
	
	@RequestMapping("/hello")
	public String hello(@RequestParam(value = "name", required = false, defaultValue = "Hello World") String name,
			Model model) {

		model.addAttribute("msg", name);

		return "helloworld";
	}
}
