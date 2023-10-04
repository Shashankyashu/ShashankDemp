package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.Subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.SubjectRepo;

@Service
public class SubjectService {
	@Autowired
	public SubjectRepo subjectRepo;
	
	public List<Subject> getAllSubjects(){
		
		List<Subject> subjects = new ArrayList<>();
		subjectRepo.findAll(). forEach(subjects::add);
		return subjects;
	}
	public void addSubject(Subject subject) {
		subjectRepo.save(subject);
		
	}
	public void updateSubject(String id, Subject subject) {
		subjectRepo.save(subject);
		
	}
	public void deleteSubject(String id) {
		subjectRepo.deleteById(id);
		
	}
	
	

}
