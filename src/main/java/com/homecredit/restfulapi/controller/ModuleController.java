package com.homecredit.restfulapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.homecredit.restfulapi.model.Modules;
import com.homecredit.restfulapi.repository.ModuleRepository;
import com.homecredit.restfulapi.service.ModuleService;

@RestController
@RequestMapping("/api")
public class ModuleController {
	
	@Autowired
	ModuleService moduleService;
	
	@GetMapping("/module/{id}")
	public Iterable<Modules> getModuleByUserId(@PathVariable(value = "id") int userId){
		return moduleService.getAllModules();
	}
	
//	@GetMapping("/module/{id}")
//	public Iterable<Modules> getAllModules(){
//		return moduleService.getAllModules();
//	}
	
//	@GetMapping("/module/{id}")
//	public List<Modules> getModuleListById(@PathVariable Integer id_user) {
//		return moduleService.getModuleListById(id_user);
//	}
	
}
