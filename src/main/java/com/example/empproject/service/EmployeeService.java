package com.example.empproject.service;

import com.example.empproject.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    public Employee addEmployee(Employee employee);
    public List<Employee> getallEmployee();

    public Employee getEmployee(int id);

    public boolean deleteEmployee(int id);

    public String updateEmplyee(int id,Employee employee);


}

