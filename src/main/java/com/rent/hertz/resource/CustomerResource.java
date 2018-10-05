package com.rent.hertz.resource;

import com.rent.hertz.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/customer")
public class CustomerResource {

    @Autowired
    private CustomerService customerService;

}
