package com.rent.hertz.resource;

import com.rent.hertz.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/employee")
public class EmployeeResource {

    @Autowired
    private EmployeeService employeeService;

}
