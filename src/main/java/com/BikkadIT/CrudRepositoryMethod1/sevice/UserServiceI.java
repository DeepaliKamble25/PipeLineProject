package com.BikkadIT.CrudRepositoryMethod1.sevice;

import java.util.List;

import com.BikkadIT.CrudRepositoryMethod1.model.User;

public interface UserServiceI  {

	
	public User saveUser(User user);
	
	public List<User> saveAllUser(List<User> list);

	public long countNoOfrecords();
	
	public boolean existsRecord(int id);
	
	public User getRecordById(int id);
	
	public List<User> getAllUser();
	
	public List<User> getRecordsMultiplePK(List<Integer> list);
	
	public void deleteRecordById(int id);
	
	public void deleteRecordByObject(User user);
	
	public void deleteAllRecordByMPK(List<Integer> list);
	
	public void deleteAllRecord();
	
}
