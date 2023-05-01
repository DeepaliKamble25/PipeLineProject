package com.BikkadIT.CrudRepositoryMethod1.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.CrudRepositoryMethod1.model.User;
import com.BikkadIT.CrudRepositoryMethod1.sevice.UserServiceI;

@RestController
public class UserController {

	@Autowired
	private UserServiceI userServiceI;
	
	public User saveUser(User user) {
		User user2 = userServiceI.saveUser(user);
		
		return user2;
		}
	public List<User> saveAllUser(List<User> list) {
		List<User> saveAll = (List<User>) userServiceI.saveAllUser(list);
		return saveAll;
	}

	public long countNoOfrecords() {
		long count = userServiceI.countNoOfrecords();
		return count;
	}

	public boolean existsRecord(int id) {
		boolean existsById = userServiceI.existsRecord(id);
		return existsById;
	}

	public User getRecordById(int id) {
		User findById = userServiceI.getRecordById(id);
		return findById;
	}

	public List<User> getAllUser() {
		List<User> findAll = userServiceI.getAllUser();
		return findAll;
	}

	//PK=primary key by inserting multiple primary key
	public List<User> getRecordsMultiplePK(List<Integer> list) {
		List<User> allById = (List<User>) userServiceI.getRecordsMultiplePK(list);
		return allById;
	}

	
	public void deleteRecordById(int id) {
		userServiceI.deleteRecordById(id);
		
	}
	public void deleteRecordByObject(User user) {
		
		userServiceI.deleteRecordByObject(user);
	}
	public void deleteAllRecordByMPK(List<Integer> list) {
		userServiceI.deleteAllRecordByMPK(list);
		
	}
    public void deleteAllRecord() {
		
    	userServiceI.deleteAllRecord();
	}


	
}
