package com.homecredit.restfulapi.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "modules")
@EntityListeners(AuditingEntityListener.class)

public class Modules implements Serializable{

	@Id
	private Integer id_modules;

	private String module_name;
	private Integer id_user;
	
//	private List<Modules> modules;
	
//	public Modules(Integer id_modules, String module_name, Integer id_user) {
//		super();
//		this.id_modules = id_modules;
//		this.module_name = module_name;
//		this.id_user = id_user;
//		this.modules = modules;
//	}

	public Integer getId_modules() {
		return id_modules;
	}

	public void setId_modules(Integer id_modules) {
		this.id_modules = id_modules;
	}

	public String getModule_name() {
		return module_name;
	}

	public void setModule_name(String module_name) {
		this.module_name = module_name;
	}

	public Integer getId_user() {
		return id_user;
	}

	public void setId_user(Integer id_user) {
		this.id_user = id_user;
	}

//	public List<Modules> getModules() {
//		return modules;
//	}
//
//	public void setModules(List<Modules> modules) {
//		this.modules = modules;
//	}
	
	@Override
	public String toString() {
		return "Modules [id_modules=" + id_modules + ", module_name=" + module_name + ", id_user=" + id_user + "]";
	}
	
}
