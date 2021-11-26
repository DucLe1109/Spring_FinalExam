package com.example.final_exam.controller;

import com.example.final_exam.entity.Employees;
import com.example.final_exam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class WebController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping({"/index"})
    public String index(Model model) {
        List<Employees> list_emp = employeeService.findAllEmployees();
        model.addAttribute("list_emp", list_emp);
        return "index";
    }

    @GetMapping({"/add"})
    public String add() {
        return "add";
    }

    @PostMapping({"/add"})
    public String create(@RequestParam Map<String, String> body) {
        String name = body.get("name");
        int wage = Integer.parseInt(body.get("wage"));
        if (name.equalsIgnoreCase("") == false && wage != 0){
            Employees e = new Employees(name,wage);
            employeeService.createEmployee(e);
        }
        return "redirect:/index";
    }

    @GetMapping({"/delete/{id}"})
    public String delete(@PathVariable int id) {
        employeeService.deleteEmployee(id);
        return "redirect:/index";
    }

    @GetMapping({"/edit/{id}"})
    public String edit(Model model, @PathVariable int id) {
        int _id = id;
        Employees p = employeeService.getEmployeeById(id);
        model.addAttribute("emp",p);
        return "edit";
    }

    @PostMapping({"/edit"})
    public String update(@RequestParam Map<String, String> body) {
        String name = body.get("name");
        int wage = Integer.parseInt(body.get("wage"));
        int id = Integer.parseInt(body.get("id"));
        Employees employees_update = employeeService.getEmployeeById(id);
        if (name.equalsIgnoreCase("") == false && wage != 0 && id != 0){
            employees_update.setName(name);
            employees_update.setWage(wage);
            employeeService.updateEmployee(employees_update);
        }
        return "redirect:/index";
    }
}
