package com.pdev.spring_boot_batch_processing_service.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JobControllerTest {

    @Autowired
    private JobController jobController;

    @Test
    void jobLauncher() {
        jobController.jobLauncher();
    }
}