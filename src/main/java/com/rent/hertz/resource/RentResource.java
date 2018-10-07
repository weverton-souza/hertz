package com.rent.hertz.resource;

import com.rent.hertz.domain.Employee;
import com.rent.hertz.domain.Rent;
import com.rent.hertz.service.RentService;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/rent")
public class RentResource {

    @Autowired
    private RentService rentService;

    @RequestMapping(value="/save", method = RequestMethod.POST)
    public Rent save(@RequestBody final Rent rent) {
        return rentService.save(rent);
    }

    @RequestMapping(value="{idRent}/update", method = RequestMethod.PUT)
    public Rent update(@PathVariable final Long idRent, @RequestBody final Rent rent) {
        return rentService.save(rent.setId(idRent));
    }

    @RequestMapping(value="/list-all", method = RequestMethod.GET)
    public Page<Rent> findAll(final Pageable pageable) {
        return  rentService.findAll(pageable);
    }

    @RequestMapping(value="/{idRent}/find", method = RequestMethod.GET)
    public Optional<Rent> findById(@PathVariable final Long idRent) {
        return rentService.findById(idRent);
    }

    @RequestMapping(value="{idsRent}/find-all", method = RequestMethod.GET)
    public List<Rent> findById(final List<Long> idsRent){
        return rentService.findAllById(idsRent);
    }

    @RequestMapping(value="/{idRent}/delete", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable final Long idRent) {
        rentService.deleteById(idRent);
    }

    @RequestMapping(value="/delete-all", method = RequestMethod.DELETE)
    public void deleteAllById(@RequestBody final List<Rent> rents) {
        rentService.deleteAllById(rents);
    }

}
