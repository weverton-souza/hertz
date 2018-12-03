package com.rent.hertz.resource;

import com.rent.hertz.domain.Vehicle;
import com.rent.hertz.resource.interfaces.HertzResource;
import com.rent.hertz.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/vehicles")
public class VehicleResource implements HertzResource<Vehicle> {

    @Autowired
    private VehicleService vehicleService;

    @Override @RequestMapping(method = RequestMethod.POST)
    public Vehicle save(@RequestBody final Vehicle vehicle){
        return vehicleService.save(vehicle);
    }

    @Override @RequestMapping(method = RequestMethod.PUT)
    public Vehicle update(@RequestBody final Vehicle vehicle){
        return vehicleService.save(vehicle);
    }

    @Override @RequestMapping(method = RequestMethod.GET)
    public List<Vehicle> findAll(){
        return  vehicleService.findAll();
    }

    @Override @RequestMapping(value="/{idVehicle}", method = RequestMethod.GET)
    public Optional<Vehicle> findById(@PathVariable final String idVehicle){
        return vehicleService.findById(idVehicle);
    }

    @Override @RequestMapping(value="/{idVehicle}", method = RequestMethod.DELETE)
    public void delete(@PathVariable final String idVehicle){
        vehicleService.findById(idVehicle)
                .ifPresent(this::accept);
    }

    private void accept(Vehicle vehicle) {
        vehicleService.delete(vehicle);
    }

}
