package com.rent.hertz.resource;

import com.rent.hertz.domain.Rent;
import com.rent.hertz.resource.interfaces.HertzResource;
import com.rent.hertz.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/rents")
public class RentResource implements HertzResource<Rent> {

    @Autowired
    private RentService rentService;

    @Override @RequestMapping(method = RequestMethod.POST)
    public Rent save(@RequestBody final Rent rent){
        return rentService.save(rent);
    }

    @Override @RequestMapping(method = RequestMethod.PUT)
    public Rent update(@RequestBody final Rent rent){
        return rentService.save(rent);
    }

    @Override @RequestMapping(method = RequestMethod.GET)
    public List<Rent> findAll(){
        return  rentService.findAll();
    }

    @Override @RequestMapping(value="/{idRent}", method = RequestMethod.GET)
    public Optional<Rent> findById(@PathVariable final String idRent){
        return rentService.findById(idRent);
    }

    @Override @RequestMapping(value="/{idRent}", method = RequestMethod.DELETE)
    public void delete(@PathVariable final String idRent){
        rentService.findById(idRent)
                .ifPresent(this::accept);
    }

    private void accept(Rent rent) {
        rentService.delete(rent);
    }

}
