package com.rent.hertz.resource;

import com.rent.hertz.domain.TrafficTicket;
import com.rent.hertz.resource.interfaces.HertzResource;
import com.rent.hertz.service.TrafficTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/tickets")
public class TrafficTicketResource implements HertzResource<TrafficTicket> {

    @Autowired
    private TrafficTicketService ticketService;

    @Override @RequestMapping(method = RequestMethod.POST)
    public TrafficTicket save(@RequestBody final TrafficTicket ticket){
        return ticketService.save(ticket);
    }

    @Override @RequestMapping(method = RequestMethod.PUT)
    public TrafficTicket update(@RequestBody final TrafficTicket ticket){
        return ticketService.save(ticket);
    }

    @Override @RequestMapping(method = RequestMethod.GET)
    public List<TrafficTicket> findAll(){
        return  ticketService.findAll();
    }

    @Override @RequestMapping(value="/{idTicket}", method = RequestMethod.GET)
    public Optional<TrafficTicket> findById(@PathVariable final String idTicket){
        return ticketService.findById(idTicket);
    }

    @Override @RequestMapping(value="/{idTicket}", method = RequestMethod.DELETE)
    public void delete(@PathVariable final String idTicket){
        ticketService.findById(idTicket)
                .ifPresent(this::accept);
    }

    private void accept(TrafficTicket ticket) {
        ticketService.delete(ticket);
    }

}
