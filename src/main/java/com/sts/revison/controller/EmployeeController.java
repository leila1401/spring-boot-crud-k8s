package com.sts.revison.controller;

import com.sts.revison.SERVICE.EmployeeService;
import com.sts.revison.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    //Create an Employee
    @PostMapping("/create")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(service.saveEmployee(employee), HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public  ResponseEntity<List<Employee>> getAllEmployees(){
        return new ResponseEntity<>(service.getAllEmployee(), HttpStatus.OK);
    }
}
