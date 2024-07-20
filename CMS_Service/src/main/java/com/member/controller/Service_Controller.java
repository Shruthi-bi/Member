package com.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.member.Entity.Service_Entity;
import com.member.repo.service_repository;
import com.member.service.Service_service;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class Service_Controller {
@Autowired
private Service_service s;

@PostMapping("save")
public ResponseEntity<String>saveService_Entity(@RequestBody Service_Entity service){
	String saveService_Entity=s.saveService_Entity(service);
    return ResponseEntity.status(HttpStatus.CREATED).body(saveService_Entity );

}
@GetMapping("/getAll")
public ResponseEntity<List<Service_Entity>>getAll(){
	List<Service_Entity> obj=s.getAll();
	return ResponseEntity.status(HttpStatus.OK).body(obj);
	
}
@PutMapping("/update/{id}")
public ResponseEntity<String> updateService_Entity(@PathVariable int id,@RequestBody Service_Entity service){
	String updateService_Entity=s.updateService_Entity(id,service);
	return ResponseEntity.status(HttpStatus.OK).body(updateService_Entity);
	
}
@DeleteMapping("/delete/{id}")
public ResponseEntity<String> deleteService_Entity(@PathVariable int id){
	String deleteService_Entity=s.deleteService_Entity(id);
	return ResponseEntity.status(HttpStatus.OK).body(deleteService_Entity);
}

}