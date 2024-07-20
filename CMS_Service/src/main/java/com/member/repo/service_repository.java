package com.member.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.member.Entity.Service_Entity;

public interface service_repository extends JpaRepository<Service_Entity, Integer>{

}
