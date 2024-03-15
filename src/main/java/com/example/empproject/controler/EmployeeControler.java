package com.example.empproject.controler;

import com.example.empproject.model.Employee;
import com.example.empproject.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/emp")
public class EmployeeControler {

    private  EmployeeService employeeService;
    public EmployeeControler(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    //all the employee
    @GetMapping("employees")
    public List<Employee> getalldata(){
       return employeeService.getallEmployee();

    }

    //employee by id
    @GetMapping("employees/{id}")
    public Employee getemployeeid(@PathVariable int id){
        return employeeService.getEmployee(id);
    }

    //add employe
    @PostMapping("employees")
    public Employee addemp(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    //delete employee
    @DeleteMapping("employees/{id}")
    public  boolean deleteemp(@PathVariable int id){
        return employeeService.deleteEmployee(id);
    }

    //update employee details
    @PutMapping("employees/{id}")
    public String updateemp(@PathVariable int id,@RequestBody Employee employee){
        return employeeService.updateEmplyee(id,employee);
    }

}
