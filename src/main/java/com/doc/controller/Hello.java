package com.doc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@GetMapping(value="/get")
	public String get() {
		return "HelloWorld";
	}

}
