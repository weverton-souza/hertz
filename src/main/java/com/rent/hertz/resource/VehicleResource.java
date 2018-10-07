package com.rent.hertz.resource;

import com.rent.hertz.domain.Vehicle;
import com.rent.hertz.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/vehicle")
public class VehicleResource {

    @Autowired
    private VehicleService vehicleService;

    @RequestMapping(value="/save", method = RequestMethod.POST)
    public Vehicle save(@RequestBody final Vehicle vehicle) {
        return vehicleService.save(vehicle);
    }

    @RequestMapping(value="/{idVehicle}/update", method = RequestMethod.PUT)
    public Vehicle update(@PathVariable final Long idVehicle, @RequestBody final Vehicle vehicle) {
        return vehicleService.save(vehicle.setId(idVehicle));
    }

    @RequestMapping(value="/list-all", method = RequestMethod.GET)
    public Page<Vehicle> findAll(final Pageable pageable) {
        return  vehicleService.findAll(pageable);
    }

    @RequestMapping(value="/{idVehicle}/find", method = RequestMethod.GET)
    public Optional<Vehicle> findById(@PathVariable final Long idVehicle) {
        return vehicleService.findById(idVehicle);
    }

    @RequestMapping(value="/{idsVehicle}/find-all", method = RequestMethod.GET)
    public List<Vehicle> findAllById(@PathVariable final List<Long> idsVehicle){
        return vehicleService.findAllById(idsVehicle);
    }

    @RequestMapping(value="/{idVehicle}/delete", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable final Long idVehicle) {
        vehicleService.deleteById(idVehicle);
    }

    @RequestMapping(value="/delete-all", method = RequestMethod.DELETE)
    public void deleteById(@RequestBody final List<Vehicle> vehicles) {
        vehicleService.deleteAllById(vehicles);
    }

}
