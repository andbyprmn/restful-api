package com.homecredit.restfulapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.homecredit.restfulapi.model.Modules;

public interface ModuleRepository extends CrudRepository<Modules, Integer> {
	
}


//JpaRepository<Modules, Integer>{
//
//	List<Modules> findById(int userId);
//	
////	List<Modules> findAllByUserID(int userId);
//	
//}
