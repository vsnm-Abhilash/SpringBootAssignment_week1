package com.abhilash.sb.assignment_w1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssignmentW1Application implements CommandLineRunner {
	@Autowired
	CakeBaker cb;
	public static void main(String[] args) {
		SpringApplication.run(AssignmentW1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Im In!!");
		System.out.println(cb.bakeCake());

	}
}
