package com.rent.hertz.repository;

import com.rent.hertz.domain.TrafficTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrafficTicketRepository extends JpaRepository<TrafficTicket, Long> {
}
