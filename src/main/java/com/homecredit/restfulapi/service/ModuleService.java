package com.homecredit.restfulapi.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homecredit.restfulapi.model.Modules;
import com.homecredit.restfulapi.repository.ModuleRepository;

@Service
public class ModuleService {
	
	@Autowired
	private ModuleRepository moduleRepository;
	
	private static List<Modules> moduleList = new ArrayList<Modules>();
	
	public Iterable<Modules> getAllModules() {
		return moduleRepository.findAll();
	}
	
	public Modules getModuleById(Integer id_user) {
		for (Modules module: moduleList) {
			if (module.getId_user().equals(module)) {
				return module;
			}
		}
		return null;
	}
	
//	public List<Modules> getModuleListById(Integer id_user) {
//		Modules modules = getModuleById(id_user);
//		
//		if (modules == null) {
//			return null;
//		}
//
//		return modules.getModules();
//	}

}
