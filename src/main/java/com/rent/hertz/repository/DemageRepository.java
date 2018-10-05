package com.rent.hertz.repository;

import com.rent.hertz.domain.Demage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemageRepository extends JpaRepository<Demage, Long> {
}
