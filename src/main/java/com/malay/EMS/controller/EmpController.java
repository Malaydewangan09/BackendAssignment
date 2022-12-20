package com.malay.EMS.controller;


import com.malay.EMS.model.Employee;
import com.malay.EMS.service.EmpService;
import org.hibernate.procedure.spi.ParameterRegistrationImplementor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.BasicPermission;
import java.security.PrivateKey;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PrimitiveIterator;

@RestController
@RequestMapping("/api/v1/")
public class EmpController {


    @Autowired
    private EmpService empService ;

    @PostMapping("/employees")
    public Employee saveEmp (@RequestBody Employee employee){
        return empService.saveEmp(employee) ;

    }
    @GetMapping("/employees")
    public List<Employee> getAll() {
        return empService.getAll();

    }
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmp(@PathVariable("id") Long id){
        Employee employee = empService.getEmp(id);
       return ResponseEntity.ok(employee);

    }

    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Map<String , Boolean>> delEmp(@PathVariable("id") Long id){

        boolean deleted =false ;
        deleted = empService.delEmp(id);
        Map<String , Boolean> map = new HashMap<>();
        map.put("deleted" , deleted) ;
        return ResponseEntity.ok(map) ;


    }
    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updEmp(@PathVariable("id") Long id , @RequestBody Employee employee){

        employee = empService.updEmp(id , employee) ;
        return ResponseEntity.ok(employee) ;


    }





}
