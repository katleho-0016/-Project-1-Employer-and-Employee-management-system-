package com.katleho.management.system.managementsystem.Employee.repository;

import com.katleho.management.system.managementsystem.Employee.Employee;
import com.katleho.management.system.managementsystem.Employee.controller.EmployeeController;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    ThreadLocal<Object> findAllByRole(String role);
}
