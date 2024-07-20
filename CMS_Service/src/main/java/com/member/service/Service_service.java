package com.member.service;

import java.lang.reflect.Member;
import java.security.Provider.Service;
import java.util.List;

import org.apache.catalina.User;

import com.member.Entity.Service_Entity;


public interface Service_service  {
	public String saveService_Entity(Service_Entity service);
	public List<Service_Entity> getAll();
	public String updateService_Entity(int id ,Service_Entity service);
	public String deleteService_Entity(int id);
	
	
}
