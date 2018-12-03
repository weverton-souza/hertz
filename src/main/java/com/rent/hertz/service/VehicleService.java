package com.rent.hertz.service;

import com.rent.hertz.domain.Vehicle;
import com.rent.hertz.repository.VehicleRepository;
import com.rent.hertz.service.interfaces.HertzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService implements HertzService<Vehicle> {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public Vehicle save(final Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle update(final Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Optional<Vehicle> findById(final String idVehicle){
        return vehicleRepository.findById(idVehicle);
    }

    @Override
    public List<Vehicle> findAll(){
        return vehicleRepository.findAll();
    }

    @Override
    public void delete(final Vehicle vehicle){
        vehicleRepository.delete(vehicle);
    }
}
