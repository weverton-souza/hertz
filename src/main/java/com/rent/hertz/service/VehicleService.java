package com.rent.hertz.service;

import com.rent.hertz.domain.Vehicle;
import com.rent.hertz.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public Vehicle save(final Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }

    public Optional<Vehicle> findById(final Long idVehicle){
        return vehicleRepository.findById(idVehicle);
    }

    public List<Vehicle> findAllById(final List<Long> idsRents){
        return vehicleRepository.findAllById(idsRents);
    }

    public Page<Vehicle> findAll(final Pageable pageable){
        return vehicleRepository.findAll(pageable);
    }

    public void deleteById(final Long idCategory){
        vehicleRepository.deleteById(idCategory);
    }

    public void deleteAllById(final List<Vehicle> vehicles){
        vehicleRepository.deleteAll(vehicles);
    }
}
