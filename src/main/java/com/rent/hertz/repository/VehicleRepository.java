package com.rent.hertz.repository;

import com.rent.hertz.domain.Vehicle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    @Query(value="select * from vehicle v where category_id = :idCategory", nativeQuery = true)
    Page<Vehicle> findVehicleByCategory(@Param("idCategory") String idCategory, Pageable pageable);
}
