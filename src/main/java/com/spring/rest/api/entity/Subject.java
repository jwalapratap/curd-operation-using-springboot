package com.spring.rest.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {
	
	@Id
	private Long id;
	private String title;
	private String description;
	
	
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Subject(Long id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Subject [id=" + id + ", title=" + title + ", description=" + description + "]";
	}
	
	

}
