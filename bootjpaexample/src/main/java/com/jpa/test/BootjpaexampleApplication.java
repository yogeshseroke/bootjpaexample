package com.jpa.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.copy.UserReposetory;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(BootjpaexampleApplication.class, args);
		
		UserReposetory userRepository=context.getBean(UserReposetory.class);
		
		
		User user = new User();
		
		user.setId(1);
		user.setName("a");
		user.setCity("indore");
		user.setStatus("smart city");
		
		User user1=userRepository.save(user);
		user1.toString();	
		}

}
