package com.example.demojpa.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demojpa.entity.DepartmentEntity;

@Repository
public interface DepartmentRepository extends CrudRepository<DepartmentEntity, Integer> {
}