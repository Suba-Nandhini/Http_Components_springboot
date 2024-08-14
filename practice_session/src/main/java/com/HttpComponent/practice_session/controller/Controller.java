package com.HttpComponent.practice_session.controller;


import com.HttpComponent.practice_session.dto.ResponseDTO;
import com.HttpComponent.practice_session.model.Employee;
import com.HttpComponent.practice_session.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@NoArgsConstructor
@AllArgsConstructor
@RequestMapping("/api/practice")
public class Controller {
    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/httpComponents/{e_id}")
    public ResponseDTO components(
            @PathVariable("e_id") String e_id,
            @RequestParam("e_name") String e_name,
            @RequestBody Employee employee
    ){
        ResponseDTO responseDTO=new ResponseDTO();
        responseDTO.setEmployee(employee);
        responseDTO.setEId(e_id);
        responseDTO.setEName(e_name);

        return responseDTO;

    }

    @PostMapping("/responseBody")
    public Employee response(@RequestBody  Employee employee){
        return employeeRepository.save(employee);
    }
    @GetMapping("/pathParams/{id}")
    public Optional<Employee> pathParams(@PathVariable String id){
        Optional<Employee> e1=employeeRepository.findById(id);
        return e1;
    }

    @GetMapping("/queryParam")
    public Optional<Employee> queryParam(@RequestParam(required = false) String e_id){
        return employeeRepository.findById(e_id);

    }
    @GetMapping("/Header")
    public Optional<Employee> Header(@RequestHeader(value = "e_id",required = false) String id){
        return employeeRepository.findById(id);
    }
}