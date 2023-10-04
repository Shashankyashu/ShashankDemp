package com.example.demo.repo;

import javax.security.auth.Subject;

import org.springframework.data.repository.CrudRepository;

public interface SubjectRepo extends CrudRepository<Subject, String> {
	

}
