// File: src/main/java/com/transcation/assignment/service/TestService.java
package com.transcation.assignment.service;

import com.transcation.assignment.Entity.Test;
import com.transcation.assignment.Repo.TestRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestRepo testRepo;

    @Transactional
    public void testOperations() {
        System.out.println("Transaction started");

        testRepo.save(new Test("Jack", "Smith", "123 Elm Street"));
        testRepo.save(new Test("Jill", "Johnson", "456 Oak Avenue"));
        testRepo.findAll().forEach(System.out::println);

        throw new RuntimeException("Intentional failure for rollback");
    }
}