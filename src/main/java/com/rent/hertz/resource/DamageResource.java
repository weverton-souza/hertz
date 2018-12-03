package com.rent.hertz.resource;

import com.rent.hertz.domain.Damage;
import com.rent.hertz.resource.interfaces.HertzResource;
import com.rent.hertz.service.DamageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/damages")
public class DamageResource implements HertzResource<Damage> {

    @Autowired
    private DamageService damageService;

    @Override @RequestMapping(method = RequestMethod.POST)
    public Damage save(@RequestBody final Damage damage){
        return damageService.save(damage);
    }

    @Override @RequestMapping(method = RequestMethod.PUT)
    public Damage update(@RequestBody final Damage damage){
        return damageService.save(damage);
    }

    @Override @RequestMapping(method = RequestMethod.GET)
    public List<Damage> findAll(){
        return  damageService.findAll();
    }

    @Override @RequestMapping(value="/{idDamage}", method = RequestMethod.GET)
    public Optional<Damage> findById(@PathVariable final String idDamage){
        return damageService.findById(idDamage);
    }

	@Override @RequestMapping(value="/{idDamage}", method = RequestMethod.DELETE)
	public void delete(@PathVariable final String idDamage){
		damageService.findById(idDamage)
				.ifPresent(this::accept);
	}

	private void accept(Damage damage) {
		damageService.delete(damage);
	}
}
