package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sbs")
public class MyController {

	@RequestMapping("/hello")
	public String Hello() {

		return "Hello World";
	}
}
