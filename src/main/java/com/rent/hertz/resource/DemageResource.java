package com.rent.hertz.resource;

import com.rent.hertz.domain.Demage;
import com.rent.hertz.service.DemageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/demage")
public class DemageResource {

    @Autowired
    private DemageService demageService;

    @RequestMapping(value="/save", method = RequestMethod.POST)
    public Demage save(@RequestBody final Demage demage) {
        return demageService.save(demage);
    }

    @RequestMapping(value="{idCategory}/update", method = RequestMethod.PUT)
    public Demage update(@PathVariable final Long idDemage, @RequestBody final Demage demage) {
        return demageService.save(demage.setId(idDemage));
    }

    @RequestMapping(value="/list-all", method = RequestMethod.GET)
    public Page<Demage> findAll(final Pageable pageable) {
        return  demageService.findAll(pageable);
    }

    @RequestMapping(value="/{idDemage}/find", method = RequestMethod.GET)
    public Optional<Demage> findById(@PathVariable final Long idDemage) {
        return demageService.findById(idDemage);
    }

    @RequestMapping(value="/find-all", method = RequestMethod.GET)
    public List<Demage> findAllById(@PathVariable final List<Long> idsDemages){
        return demageService.findAllById(idsDemages);
    }

    @RequestMapping(value="/{idDemage}/delete", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable final Long idCustomer) {
        demageService.deleteById(idCustomer);
    }

    @RequestMapping(value="/delete-all", method = RequestMethod.DELETE)
    public void deleteById(@RequestBody final List<Demage> demages) {
        demageService.deleteAllById(demages);
    }

}
