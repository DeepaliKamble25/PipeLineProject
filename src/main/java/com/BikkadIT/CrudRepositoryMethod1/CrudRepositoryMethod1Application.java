package com.BikkadIT.CrudRepositoryMethod1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.CrudRepositoryMethod1.controller.UserController;
import com.BikkadIT.CrudRepositoryMethod1.model.User;

@SpringBootApplication
public class CrudRepositoryMethod1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CrudRepositoryMethod1Application.class, args);
	

	
	UserController controller = context.getBean(UserController.class);
	
//	User user=new User();
//	
//	user.setUserId(1);
//	user.setUserName("Naik");
//	user.setUserAddress("Nashik");
//	user.setUserAge(50);
//	
//	controller.saveUser(user);
//	User user0 = new User();
//	user0.setUserId(2);
//	user0.setUserName("Harisha");
//	user0.setUserAddress("Raigada");
//	user0.setUserAge(88);
//
//	User user1 = new User();
//	user1.setUserId(3);
//	user1.setUserName("Jadesha");
//	user1.setUserAddress("Panvel");
//	user1.setUserAge(77);
//
//	User user2 = new User();
//	user2.setUserId(4);
//	user2.setUserName("Viraj");
//	user2.setUserAddress("Bhandupa");
//	user2.setUserAge(55);
//	
//	List<User> list=new ArrayList();
//	list.add(user0);
//	list.add(user1);
//	list.add(user2);
//	
//	List<User> saveAllUser = controller.saveAllUser(list);
//	System.out.println(saveAllUser);

//	     long countNoOfrecords = controller.countNoOfrecords();
//	     System.out.println("count record added in user  :"+countNoOfrecords);//4
	
//	boolean existsRecord = controller.existsRecord(5);
//	System.out.println(existsRecord);//false
	
//	         User user = controller.getRecordById(3);
//	         System.out.println(user);
	//List<User> allUser = controller.getAllUser();
	//System.out.println(allUser);
	

//	List<Integer> list = Arrays.asList(2, 4,1);
//    List<User> recordsMultiplePK = controller.getRecordsMultiplePK(list);
//    System.out.println(recordsMultiplePK);
	
//	controller.deleteRecordById(2);
//	System.out.println("record is deleted succefully");
//	User user=new User();
//	user.setUserId(1);
//	controller.deleteRecordByObject(user);
	
//	List<Integer> list=Arrays.asList(3,5);
// 	controller.deleteAllRecordByMPK(list);
	
	controller.deleteAllRecord();
	}

}
