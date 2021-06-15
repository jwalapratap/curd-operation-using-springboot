package com.spring.rest.api.service;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.api.dao.Dao;
import com.spring.rest.api.entity.Subject;


@Service
public class ServiceImpl implements Servicess{

	@Autowired
	private Dao dao;
	
	@Override
	public List<Subject> getSubjects() {
		
		return dao.findAll();
	}

	@Override
	public Subject getSubject(long subId) {
		
		return dao.getOne(subId);
	}

	@Override
	public Subject addSubject(Subject sub) {
	
		dao.save(sub);
 		return sub;
	}

	@Override
	public Subject updateSubject(Subject sub) {
		
		dao.save(sub);
		return sub;
	}

	@Override
	public void deleteSubject(long parseLong) {

		Subject entity = dao.getOne(parseLong);
		dao.delete(entity);
		
	}
	



}
