package com.simplilearn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.pojo.Greet;

@RestController
public class RestGreetController {

	@RequestMapping(value = "/greetMe", method = RequestMethod.GET)
	public Greet greeting() {
		Greet greet = new Greet();
		greet.setMessage("Hello World!");
		greet.setName("Dhruvik");
		return greet;
	}
}