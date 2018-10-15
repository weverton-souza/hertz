package com.rent.hertz.repository;

import com.rent.hertz.domain.TrafficTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrafficTicketRepository extends JpaRepository<TrafficTicket, Long> {
}
