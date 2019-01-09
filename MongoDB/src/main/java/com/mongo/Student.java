package com.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="XYZW")
public class Student {

	@Id
	private String name;
	private String grade;


	public void setName(String name) {
		this.name = name;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public String getGrade() {
		return grade;
	}
	
	
}
