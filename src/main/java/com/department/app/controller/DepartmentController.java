package com.department.app.controller;


import java.util.List;
import com.department.app.Entity.Department;
import com.department.app.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @RequestMapping("/")
    public String viewHomePage(Model model){
        List<Department> department = departmentService.listALl();
        model.addAttribute("listDepartment", department);
        return "index";
    }
    @RequestMapping("/new")
    public String addNewDepartment(Model model){
        Department department = new Department();
        model.addAttribute("department",department);
        return "new";
    }

    @PostMapping(value ="/save")
    public String saveDepartment(@ModelAttribute("department") Department department){
        departmentService.saveDepartment(department);
        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditFrom(@PathVariable(name = "id") Long id){
        ModelAndView mav = new ModelAndView("edit");
        Department department = departmentService.getById(id);
        mav.addObject("department", department);
        return mav;
    }

    @RequestMapping("/delete/{id}")
    public String deleteDepartment(@PathVariable(name = "id") Long id){
        departmentService.deleteById(id);
        return "redirect:/";
    }



}
