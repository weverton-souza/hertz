package com.rent.hertz.service;

import com.rent.hertz.domain.Damage;
import com.rent.hertz.repository.DemageRepository;
import com.rent.hertz.service.interfaces.HertzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DamageService implements HertzService<Damage> {

    @Autowired
    private DemageRepository demageRepository;

    @Override
    public Damage save(final Damage damage){
        return demageRepository.save(damage);
    }

    @Override
    public Damage update(final Damage damage){
        return demageRepository.save(damage);
    }

    @Override
    public Optional<Damage> findById(final String idDemage){
        return demageRepository.findById(idDemage);
    }

    @Override
    public List<Damage> findAll(){
        return demageRepository.findAll();
    }

    @Override
    public void delete(final Damage damage){
        demageRepository.delete(damage);
    }
}
