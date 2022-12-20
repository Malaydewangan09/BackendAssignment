package com.malay.EMS.service;

import com.malay.EMS.entity.assignment;
import com.malay.EMS.model.Employee;

import java.util.List;

public interface EmpService {
    
    Employee saveEmp(Employee employee);

    List<assignment> getAll();

    Employee getEmp(Long id);

    boolean delEmp(Long id);

    Employee updEmp(Long id, Employee employee);
}
