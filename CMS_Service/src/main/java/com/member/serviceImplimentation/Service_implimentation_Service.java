package com.member.serviceImplimentation;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.member.Entity.Service_Entity;
import com.member.repo.service_repository;
import com.member.service.Service_service;
@Service
public class Service_implimentation_Service implements Service_service {
@Autowired
private service_repository repo;

@Override
public String saveService_Entity(Service_Entity service) {
	repo.save(service);
	return "saved";
}

@Override
public List<Service_Entity> getAll() {
	return repo.findAll();
}

@Override
public String updateService_Entity(int id ,Service_Entity service) {
	Service_Entity up= repo.findById(id).get();
	up.setName(service.getName());
	repo.save(up);
	return "updated";
}

@Override
public String deleteService_Entity(int id) {
repo.deleteById(id);
	return "deleted";
}


	
	}


