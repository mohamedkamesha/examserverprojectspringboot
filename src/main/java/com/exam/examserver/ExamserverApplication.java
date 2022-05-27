package com.exam.examserver;

import com.exam.examserver.model.Role;
import com.exam.examserver.model.User;
import com.exam.examserver.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {

	final UserService userService;

	public ExamserverApplication(UserService userService) {
		this.userService = userService;
	}

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(" start application ");
//		User user = new User();
//		user.setUserName("mohamedk12360");
//		user.setEmail("mohamedk12360@gmail.com");
//		user.setPassword("1234");
//		user.setFirstName("mohamed");
//		user.setLastName("kamesha");
//		user.setAbout("profile.png");
//		user.setPhone("01011249517");
//
//
//		Role role = new Role();
//		role.setRole("admin");
//
//		Set<Role> roles = new HashSet<>();
//		roles.add(role);
//
//		//user.setRoles(roles);
//
//		userService.createUser(user,roles);

	}
}
