package com.example.demojpa.entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Department", schema = "dbo", catalog = "master")
public class DepartmentEntity {
    @Id
    @Column(name = "DepartmentID", nullable = false)
    private int departmentID;

    @Basic
    @Column(name = "Name", nullable = true, length = 50)
    private String name;

    @Basic
    @Column(name = "Budget")
    private BigDecimal budget;

    @Column(name = "StartDate", nullable = false)
    private Timestamp satartDate;
    
    @Basic
    @Column(name = "InstructorID", nullable = false)
    private int instructorID;
}
