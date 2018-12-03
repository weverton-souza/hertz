package com.rent.hertz.service;

import com.rent.hertz.domain.TrafficTicket;
import com.rent.hertz.repository.TrafficTicketRepository;
import com.rent.hertz.service.interfaces.HertzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrafficTicketService implements HertzService<TrafficTicket> {

    @Autowired
    private TrafficTicketRepository ticketRepository;

    @Override
    public TrafficTicket save(final TrafficTicket trafficTicket){
        return ticketRepository.save(trafficTicket);
    }

    @Override
    public TrafficTicket update(final TrafficTicket trafficTicket){
        return ticketRepository.save(trafficTicket);
    }

    @Override
    public Optional<TrafficTicket> findById(final String idTicket){
        return ticketRepository.findById(idTicket);
    }

    @Override
    public List<TrafficTicket> findAll(){
        return ticketRepository.findAll();
    }

    @Override
    public void delete(final TrafficTicket ticket){
        ticketRepository.delete(ticket);
    }
}
