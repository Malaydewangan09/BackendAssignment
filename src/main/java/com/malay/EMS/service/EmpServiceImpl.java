package com.malay.EMS.service;

import com.malay.EMS.entity.assignment;
import com.malay.EMS.model.Employee;
import com.malay.EMS.repository.EmpRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService{

    @Autowired
    private EmpRepository empRepository;


//Create a record
    @Override
    public Employee saveEmp(Employee employee) {
        assignment assignment = new assignment() ;
        BeanUtils.copyProperties(employee,assignment);
        empRepository.save(assignment);
        return employee;
    }

    //get all the records
    @Override
    public List<assignment> getAll() {
        List<assignment> empEntities = empRepository.findAll();

        return empEntities;


    }

    //get a record with Id
    @Override
    public Employee getEmp(Long id) {
        assignment assignment = empRepository.findById(id).get() ;
        Employee employee = new Employee() ;
        BeanUtils.copyProperties(assignment , employee);
        return employee ;

    }

    //Delete a record
    @Override
    public boolean delEmp(Long id) {

        empRepository.deleteById(id) ;
        return true ;

    }

    //update a record
    @Override
    public Employee updEmp(Long id, Employee employee) {
        assignment assignment = empRepository.findById(id).get();


        assignment.setName(employee.getName());
        assignment.setAddress(employee.getAddress());
        assignment.setPincode(employee.getPincode());
        assignment.setState(employee.getState());


        empRepository.save(assignment) ;

        return employee ;

    }


}
