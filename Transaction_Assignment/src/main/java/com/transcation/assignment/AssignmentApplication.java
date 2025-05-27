package com.transcation.assignment;

import com.transcation.assignment.Entity.Test;

import com.transcation.assignment.Repo.TestRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssignmentApplication implements CommandLineRunner {

	@Autowired
	com.transcation.assignment.service.TestService testService;

	public static void main(String[] args) {

		SpringApplication.run(AssignmentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		testService.testOperations();

	}

}
