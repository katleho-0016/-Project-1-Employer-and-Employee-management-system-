package com.katleho.management.system.managementsystem.Employee.controller;

import com.katleho.management.system.managementsystem.Employee.Employee;
import com.katleho.management.system.managementsystem.Employee.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private EmployeeRepository employeeRepository;
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @PostMapping("/addEmployee")
    public Object addEmployee(@RequestBody Employee employee) {
        try{
            if (employeeRepository.findById(employee.getId()).isPresent()) {
                return "Employee already exists";
            }
            return employeeRepository.save(employee);
        }catch(Exception e){
            return  e.getMessage();
        }
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable Integer id) {
        try{
            employeeRepository.deleteById(id);
        }catch(Exception e){
            return "Failed to delete";
        }return "delete successful";
    }

    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees() {
        try{
            return (List<Employee>) employeeRepository.findAll();
        }catch (NullPointerException e){
            return null;
        }
    }

    @GetMapping("/getEmployee/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        try{
            return employeeRepository.findById(id).get();
        }catch (NullPointerException e){return null;}
    }

    @GetMapping("/getEmployee/{role}")
    public List<Employee> getEmployeeByRole(@PathVariable String role) {
        try{
            return (List<Employee>) employeeRepository.findAllByRole(role).get();
        }catch (NullPointerException e){return null;}
    }





}
