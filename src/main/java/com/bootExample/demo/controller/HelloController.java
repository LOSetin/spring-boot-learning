package com.bootExample.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootExample.demo.javabean.StudentProperties;

@RestController
public class HelloController {
	
	@Autowired
		private StudentProperties _studentProperties;
	
	@RequestMapping("/hello")
	public String Hello()
	{
//		return "index.html";
		return _studentProperties.getName()+_studentProperties.getAge();
	}
	

}
