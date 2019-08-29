package com.homecredit.restfulapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.homecredit.restfulapi.model.Modules;
import com.homecredit.restfulapi.repository.ModuleRepository;

@RestController
@RequestMapping("/api")
public class ModuleController {
	
	@Autowired
	ModuleRepository moduleRepository;
	
	@GetMapping("/module/{id}")
	public List<Modules> getModuleByUserId(@PathVariable(value = "id") int userId){
//		System.out.println("User ID ------> "+userId);
//		return moduleRepository.findById(userId);
		return moduleRepository.findAll();
	}
	
//	@GetMapping("/module/{id}")
//    public ModuleRepository getModuleById(@PathVariable(value = "id") Long moduleId) {
//        return moduleRepository.findById(moduleId).orElseThrow(() -> new Resource);
//    }
	
//	@GetMapping("/{id}")
//	public String getModuleById(@PathVariable(value = "id") int id){
//		List<Modules> module = moduleRepository.findAllByIdUser(id);
//		
//		if (module==null)
//			return "Failed!"; //ResponseEntity.notFound().build();
//		
//		return "Success!";//ResponseEntity.ok().body(module);
//	}
	
//	@GetMapping("/module/{id}")
//	public ResponseEntity<Modules> getModuleByUserId(@PathVariable(value="id") Long userId){
//		Modules module = moduleRepository.findById(userId);
//		
//		if(module == null)
//			return ResponseEntity.notFound().build();
//		
//		return ResponseEntity.ok().body(module);
//	}
}
