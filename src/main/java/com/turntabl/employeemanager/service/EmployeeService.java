package com.turntabl.employeemanager.service;

import com.turntabl.employeemanager.exception.UserNotFounddException;
import com.turntabl.employeemanager.model.Employee;
import com.turntabl.employeemanager.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    public List<Employee>  findAllEmployee(){
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }

    public Employee findEmployeeById(Long id){
       return  employeeRepository.findEmployeeById(id)
               .orElseThrow(()-> new UserNotFounddException("User by " + id + "is not found"));
    }

}
