package com.main;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/w3SchoolCopy")
public class MyController {
	
	@PostMapping("/html")
	public String html() {
		
		return "HTML stands for hyper text markup language.\n"
				+ "HTML is the standard markup language for Web pages.\n"
				+ "With HTML you can create your own Website.";
				
	}
	@PostMapping("/css")
	public String css() {
		
		return "CSS is the language we use to style an HTML document.\n"
				+ "CSS describes how HTML elements should be displayed.\n"
				+ "With CSS you can style your own Website.";
	}
	@PostMapping("/js")
	public String js() {
		
		return "JavaScript is the world's most popular programming language.\n"
				+ "JavaScript is the programming language of the Web.\n"
				+ "JavaScript is easy to learn.\n"
				+ "<button> Learn JS </button>";
	}
	
}
