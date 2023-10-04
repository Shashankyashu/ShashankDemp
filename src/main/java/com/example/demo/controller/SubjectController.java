package com.example.demo.controller;

import java.util.List;

import javax.security.auth.Subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.SubjectService;



@RestController
public class SubjectController {
	@Autowired
	private SubjectService subjectService; 
	
	@RequestMapping("/subjects")
	public List<Subject> getAllsubjects(){
		
		return subjectService.getAllSubjects();
	}
	@RequestMapping(method = RequestMethod.POST,value="/subjects")
	public void addSubject(@RequestBody Subject subject) {
		
		subjectService.addSubject(subject);

}
	@RequestMapping(method = RequestMethod.PUT,value="/subjects/{id}")
	public void updateSubject(@PathVariable String id,@RequestBody Subject subject) {
		
		subjectService.updateSubject(id,subject);

}
	public void DeleteSubject(@PathVariable String id) {
		
		subjectService.deleteSubject(id);
	}
}
