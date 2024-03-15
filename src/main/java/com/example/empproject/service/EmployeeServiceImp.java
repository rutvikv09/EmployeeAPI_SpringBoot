package com.example.empproject.service;

import com.example.empproject.model.Employee;
import com.example.empproject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService{

     @Autowired
     EmployeeRepository employeeRepository;

     //add employee
    @Override
    public Employee addEmployee(Employee employee) {

        return  employeeRepository.save(employee);
    }

    //get all
    @Override
    public List<Employee> getallEmployee() {
        return employeeRepository.findAll();
    }

   //findById
    @Override
    public Employee getEmployee(int id) {
        Employee em =  employeeRepository.findById(id).get();
        return em;
    }

   //Delete ById
    @Override
    public boolean deleteEmployee(int id) {
        Employee em =  employeeRepository.findById(id).get();
        employeeRepository.delete(em);
        return true;
    }

    @Override
    public String updateEmplyee( int id,Employee employee) {
        Employee em =  employeeRepository.findById(id).get();
        //em.setId(em.getId());
         em.setName(employee.getName());
         em.setAdress(employee.getAdress());
         em.setSalary(employee.getSalary());
         employeeRepository.save(em);
        return "Updated Successfully";
    }
}
