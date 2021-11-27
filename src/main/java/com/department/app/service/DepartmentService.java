package com.department.app.service;

import com.department.app.Entity.Department;

import org.springframework.stereotype.Service;
import java.util.List;


@Service
public interface DepartmentService {

    public List<Department> listALl();

    public void saveDepartment(Department department);

    public Department getById(Long id);

    public void deleteById(Long id);

}
