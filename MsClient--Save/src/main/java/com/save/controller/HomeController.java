package com.save.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.save.model.Student;
import com.save.serviceI.StudentServicesI;

@RestController
public class HomeController {
	
	@Autowired
	StudentServicesI ssi;
	
	@PostMapping("/save")
	public String saveStudent(@RequestBody Student s) {
		ssi.save(s);
		return "data saved...!!!";
	}
}
