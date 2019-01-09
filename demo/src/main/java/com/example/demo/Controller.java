package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class Controller {

	
	private RestTemplate rest = new RestTemplate();
	
	@RequestMapping("/all")
	public Student getAll(){
		Student st = new Student();
		st.setName("Gandu");
		st.setGrade("YYY");
		
		HttpEntity<Student> enitiy = new HttpEntity<>(st);
		Student s = rest.postForObject("http://localhost:9001/saveData", enitiy, Student.class);
		
		return s;
		
	}
}
