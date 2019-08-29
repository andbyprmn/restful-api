package com.homecredit.restfulapi.model;

import java.io.Serializable;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "modules")
@EntityListeners(AuditingEntityListener.class)

public class Modules implements Serializable{

	@Id
	private int id_modules;

	private String module_name;
	private int id_user;

	public int getId_modules() {
		return id_modules;
	}

	public void setId_modules(int id_modules) {
		this.id_modules = id_modules;
	}

	public String getModule_name() {
		return module_name;
	}

	public void setModule_name(String module_name) {
		this.module_name = module_name;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	
}
