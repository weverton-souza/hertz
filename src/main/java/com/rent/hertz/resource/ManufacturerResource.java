package com.rent.hertz.resource;

import com.rent.hertz.domain.Category;
import com.rent.hertz.domain.Manufacturer;
import com.rent.hertz.service.CategoryService;
import com.rent.hertz.service.ManufacturersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/manufacturer")
public class ManufacturerResource {

    @Autowired
    private ManufacturersService manufacturersService;

    @RequestMapping(value="/save", method = RequestMethod.POST)
    public Manufacturer save(@RequestBody final Manufacturer manufacturer){
        return manufacturersService.save(manufacturer);
    }

    @RequestMapping(value="{idManufacturer}/update", method = RequestMethod.PUT)
    public Manufacturer update(@PathVariable final Long idManufacturer, @RequestBody final Manufacturer manufacturer){
        return manufacturersService.save(manufacturer.setId(idManufacturer));
    }

    @RequestMapping(value="/list-all", method = RequestMethod.GET)
    public Page<Manufacturer> findAll(final Pageable pageable){
        return  manufacturersService.findAll(pageable);
    }

    @RequestMapping(value="/{idManufacturer}/find", method = RequestMethod.GET)
    public Optional<Manufacturer> findById(@PathVariable final Long idManufacturer){
        return manufacturersService.findById(idManufacturer);
    }

    @RequestMapping(value="/find-all", method = RequestMethod.GET)
    public List<Manufacturer> findAllById(@PathVariable final List<Long> idsManufacturers){
        return manufacturersService.findAllById(idsManufacturers);
    }

    @RequestMapping(value="/{idManufacturer}/delete", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable final Long idManufacturer){
        manufacturersService.deleteById(idManufacturer);
    }

    @RequestMapping(value="/delete-all", method = RequestMethod.DELETE)
    public void deleteById(@RequestBody final List<Manufacturer> manufacturers){
        manufacturersService.deleteAllById(manufacturers);
    }

}
