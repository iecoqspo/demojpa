package com.example.demojpa.rest;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demojpa.dao.DepartmentRepository;
import com.example.demojpa.entity.DepartmentEntity;

@RestController
@RequestMapping("/")
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    private DepartmentRepository repository;

    public HomeController(DepartmentRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<List<DepartmentEntity>> getAllCourseEntity() {
        try {
            List<DepartmentEntity> items = new ArrayList<DepartmentEntity>();

            repository.findAll().forEach(items::add);

            return ResponseEntity.ok(items);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/page2")
    public String getPage2() {
        logger.info("Hi...getPage2");
        return "Hey, Spring Boot 的 Hello World !";
    }
}