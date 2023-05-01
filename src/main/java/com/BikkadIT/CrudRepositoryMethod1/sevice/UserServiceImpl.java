package com.BikkadIT.CrudRepositoryMethod1.sevice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.CrudRepositoryMethod1.model.User;
import com.BikkadIT.CrudRepositoryMethod1.repository.UserRepository;


@Service
public class UserServiceImpl implements UserServiceI {
	
	@Autowired
     private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		User u= userRepository.save(user);
		return u;
	}

	@Override
	public List<User> saveAllUser(List<User> list) {
		List<User> saveAll = (List<User>)userRepository.saveAll(list);
		return saveAll;
	}

	@Override
	public long countNoOfrecords() {
		long count = userRepository.count();
		return count;
	}

	@Override
	public boolean existsRecord(int id) {
		boolean existsById = userRepository.existsById(id);
		return existsById;
	}

	@Override
	public User getRecordById(int id) {
	User user = userRepository.findById(id).get();
		return user;
	}

	@Override
	public List<User> getAllUser() {
		 List<User> findAll =(List<User>) userRepository.findAll();
		return findAll;
	}

	@Override
	public List<User> getRecordsMultiplePK(List<Integer> list) {
		List<User> findAllById =(List<User>) userRepository.findAllById(list);
		return findAllById;
	}

	@Override
	public void deleteRecordById(int id) {
		userRepository.deleteById(id);
		
	}

	@Override
	public void deleteRecordByObject(User user) {
	
		userRepository.delete(user);
	}

	
	@Override
	public void deleteAllRecordByMPK(List<Integer> list) {
		userRepository.deleteAllById(list);
		
	}

	@Override
	public void deleteAllRecord() {
		
		userRepository.deleteAll();
	}

	


	
	

	

}
