package com.rent.hertz.resource;

import com.rent.hertz.domain.Rent;
import com.rent.hertz.domain.TrafficTicket;
import com.rent.hertz.service.TrafficTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/traffic-ticket")
public class TrafficTicketResource {

    @Autowired
    private TrafficTicketService trafficTicketService;

    @RequestMapping(value="/save", method = RequestMethod.POST)
    public TrafficTicket save(@RequestBody final TrafficTicket trafficTicket) {
        return trafficTicketService.save(trafficTicket);
    }

    @RequestMapping(value="/{idTrafficTicket}/update", method = RequestMethod.PUT)
    public TrafficTicket update(@PathVariable Long idTrafficTicket, @RequestBody final TrafficTicket trafficTicket) {
        return trafficTicketService.save(trafficTicket);
    }

    @RequestMapping(value="/list-all", method = RequestMethod.GET)
    public Page<TrafficTicket> findAll(final Pageable pageable) {
        return  trafficTicketService.findAll(pageable);
    }

    @RequestMapping(value="/{idTrafficTicket}/find", method = RequestMethod.GET)
    public Optional<TrafficTicket> findById(@PathVariable final Long idTrafficTicket) {
        return trafficTicketService.findById(idTrafficTicket);
    }

    @RequestMapping(value="/{idsTrafficTicket}/find-all", method = RequestMethod.GET)
    public List<TrafficTicket> findById(@PathVariable final List<Long> idsTrafficTicket){
        return trafficTicketService.findAllById(idsTrafficTicket);
    }

    @RequestMapping(value="/{idTrafficTicket}/delete", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable final Long idTrafficTicket) {
        trafficTicketService.deleteById(idTrafficTicket);
    }

    @RequestMapping(value="/delete-all", method = RequestMethod.DELETE)
    public void deleteAllById(@RequestBody final List<TrafficTicket> trafficTickets) {
        trafficTicketService.deleteAllById(trafficTickets);
    }

}
