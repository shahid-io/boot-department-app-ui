package com.department.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.department.app.Entity.Department;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
