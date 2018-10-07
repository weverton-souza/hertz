package com.rent.hertz.service;

import com.rent.hertz.domain.TrafficTicket;
import com.rent.hertz.repository.TrafficTicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrafficTicketService {

    @Autowired
    private TrafficTicketRepository trafficTicketRepository;

    public TrafficTicket save(final TrafficTicket trafficTicket){
        return trafficTicketRepository.save(trafficTicket);
    }

    public Optional<TrafficTicket> findById(final Long idTrafficTicket){
        return trafficTicketRepository.findById(idTrafficTicket);
    }

    public List<TrafficTicket> findAllById(final List<Long> idsTrafficTickets){
        return trafficTicketRepository.findAllById(idsTrafficTickets);
    }

    public Page<TrafficTicket> findAll(final Pageable pageable){
        return trafficTicketRepository.findAll(pageable);
    }

    public void deleteById(final Long idTrafficTicket){
        trafficTicketRepository.deleteById(idTrafficTicket);
    }

    public void deleteAllById(final List<TrafficTicket> idsTrafficTickets){
        trafficTicketRepository.deleteAll(idsTrafficTickets);
    }
}
