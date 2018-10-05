package com.rent.hertz.resource;

import com.rent.hertz.service.TrafficTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/traffic-ticket")
public class TrafficTicketResource {

    @Autowired
    private TrafficTicketService trafficTicketService;

}
