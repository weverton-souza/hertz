package com.rent.hertz.resource;

import com.rent.hertz.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/rent")
public class RentResource {

    @Autowired
    private RentService rentService;

}
