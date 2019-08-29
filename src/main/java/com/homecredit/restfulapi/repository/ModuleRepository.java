package com.homecredit.restfulapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homecredit.restfulapi.model.Modules;

public interface ModuleRepository extends JpaRepository<Modules, Integer>{

	List<Modules> findById(int userId);
	
//	List<Modules> findAllByUserID(int userId);
	
}
