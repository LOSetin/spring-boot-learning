package com.bootExample.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${name}")
	private String Name;
	
	@Value("${age}")
	private Integer Age;
	
	@RequestMapping("/hello")
	public String Hello()
	{
		return Name+Age;
	}
	

}
