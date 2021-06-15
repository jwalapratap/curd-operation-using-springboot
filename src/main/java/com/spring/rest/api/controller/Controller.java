package com.spring.rest.api.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.spring.rest.api.entity.Subject;
import com.spring.rest.api.service.Servicess;

@RestController
public class Controller {


	@Autowired
	private Servicess ser;
	
	//get the all
	@GetMapping("/all")
	public List<Subject> getSubjects()
	{
		return this.ser.getSubjects();
	}
	
	//get single through Id
	@GetMapping("/all/{subId}")
	public Subject getSubject(@PathVariable String subId)
	{
	    return this.ser.getSubject(Long.parseLong(subId));
	}
	
	//add
	@PostMapping("/add")
	public Subject addSubject(@RequestBody Subject su)
	{
		return this.ser.addSubject(su);
	}
	
	//update using PUT request
	@PutMapping("/update")
	public Subject updatSubject(@RequestBody Subject su)
	{
		return this.ser.updateSubject(su);
	}
	
	//delete
	@DeleteMapping("/all/{subId}")
	public ResponseEntity<HttpStatus> deleteSubject(@PathVariable String subId){
		try {
			this.ser.deleteSubject(Long.parseLong(subId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
