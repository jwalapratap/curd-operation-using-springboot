package com.spring.rest.api.service;

import java.util.List;

import com.spring.rest.api.entity.Subject;

public interface Servicess {

public List<Subject> getSubjects();
	
	public Subject getSubject(long subId);
	
	public Subject addSubject(Subject sub);
	
	public Subject updateSubject(Subject sub);
	
	public void deleteSubject(long parseLong);

}
