package com.rent.hertz.resource;

import com.rent.hertz.domain.Manufacturer;
import com.rent.hertz.resource.interfaces.HertzResource;
import com.rent.hertz.service.ManufacturersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/manufacturers")
public class ManufacturerResource implements HertzResource<Manufacturer> {

    @Autowired
    private ManufacturersService manufacturersService;

    @Override @RequestMapping(method = RequestMethod.POST)
    public Manufacturer save(@RequestBody final Manufacturer manufacturer){
        return manufacturersService.save(manufacturer);
    }

    @Override @RequestMapping(method = RequestMethod.PUT)
    public Manufacturer update(@RequestBody final Manufacturer manufacturer){
        return manufacturersService.save(manufacturer);
    }

    @Override @RequestMapping(method = RequestMethod.GET)
    public List<Manufacturer> findAll(){
        return  manufacturersService.findAll();
    }

    @Override @RequestMapping(value="/{idManufacturer}", method = RequestMethod.GET)
    public Optional<Manufacturer> findById(@PathVariable final String idManufacturer){
        return manufacturersService.findById(idManufacturer);
    }

    @Override @RequestMapping(value="/{idManufacturer}", method = RequestMethod.DELETE)
    public void delete(@PathVariable final String idManufacturer){
        manufacturersService.findById(idManufacturer)
                .ifPresent(this::accept);
    }

    private void accept(Manufacturer manufacturer) {
        manufacturersService.delete(manufacturer);
    }
}
