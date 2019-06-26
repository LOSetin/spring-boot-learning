package com.bootExample.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bootExample.demo.mapper.StudentMapper;
import com.bootExample.demo.pojo.Student;

@Controller
public class StudentController {
	
	@Autowired
	private StudentMapper studentMapper;
	
	@RequestMapping("/listStudent")
	public String ListStudent(Model model) {
		List<Student> students = studentMapper.FindAllStudent();
		model.addAttribute("students",students);
		return "listStudent";
	}

}
