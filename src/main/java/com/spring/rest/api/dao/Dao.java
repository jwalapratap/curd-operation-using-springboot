package com.spring.rest.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.rest.api.entity.Subject;

public interface Dao extends JpaRepository<Subject, Long>{

}
