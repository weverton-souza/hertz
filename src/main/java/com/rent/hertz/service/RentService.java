package com.rent.hertz.service;

import com.rent.hertz.domain.Rent;
import com.rent.hertz.repository.RentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RentService {

    @Autowired
    private RentRepository rentRepository;

    public Rent save(final Rent rent){
        return rentRepository.save(rent);
    }

    public Optional<Rent> findById(final Long idRent){
        return rentRepository.findById(idRent);
    }

    public List<Rent> findAllById(final List<Long> idsRents){
        return rentRepository.findAllById(idsRents);
    }

    public Page<Rent> findAll(final Pageable pageable){
        return rentRepository.findAll(pageable);
    }

    public void deleteById(final Long idCategory){
        rentRepository.deleteById(idCategory);
    }

    public void deleteAllById(final List<Rent> rents){
        rentRepository.deleteAll(rents);
    }
}
