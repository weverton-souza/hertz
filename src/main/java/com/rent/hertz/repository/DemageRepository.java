package com.rent.hertz.repository;

import com.rent.hertz.domain.Damage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemageRepository extends JpaRepository<Damage, String> {
}
