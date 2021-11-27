package com.department.app.service;

import com.department.app.Entity.Department;
import com.department.app.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<Department> listALl() {
        return departmentRepository.findAll();
    }

    @Override
    public void saveDepartment(Department department) {
        departmentRepository.save(department);
    }

    @Override
    public Department getById(Long id) {
        return departmentRepository.getById(id);
    }

    @Override
    public void deleteById(Long id){
        departmentRepository.deleteById(id);
    }

}
