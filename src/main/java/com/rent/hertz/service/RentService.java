package com.rent.hertz.service;

import com.rent.hertz.domain.Rent;
import com.rent.hertz.repository.RentRepository;
import com.rent.hertz.service.interfaces.HertzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RentService implements HertzService<Rent> {

    @Autowired
    private RentRepository rentRepository;

    @Override
    public Rent save(final Rent rent){
        return rentRepository.save(rent);
    }

    @Override
    public Rent update(final Rent rent){
        return rentRepository.save(rent);
    }

    @Override
    public Optional<Rent> findById(final String idRent){
        return rentRepository.findById(idRent);
    }

    @Override
    public List<Rent> findAll(){
        return rentRepository.findAll();
    }

    @Override
    public void delete(final Rent rent){
        rentRepository.delete(rent);
    }
}
