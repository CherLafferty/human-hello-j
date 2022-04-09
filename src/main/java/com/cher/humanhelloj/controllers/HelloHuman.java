package com.cher.humanhelloj.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHuman {
	
	@RequestMapping("/")
	public String index() {
		return "<h1>Hello Human</h1>";
	}
	
	@RequestMapping("/name")
	//note search in url s/b name?q=Cher&last=Lafferty where 'Cher' and 'Lafferty' are the variables.
	public String name(@RequestParam(value="q", required=false) String name, String last ) {
		if(name == null && last == null) {
			return "You did not put your name.";
		} else {
			return "hello " + name + " " + last;
		}
	}

}
