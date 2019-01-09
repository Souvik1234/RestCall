package com.mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	@Autowired
	private DBCon d;
	
	@RequestMapping("/all")
	public List<Student> getAllData() {
		return d.findAll();
	}
	
	@RequestMapping("/saveData")
	public Student saveData(@RequestBody Student st) {
		
		
		d.save(st);
		/*StudentRet st = new StudentRet();
		//st.setId(student.getId());
		st.setGrade(student.getGrade());
		st.setName(student.getName());
		st.setMsg("Custom MSG");
*/
		return st;
	}
}
