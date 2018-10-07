package com.rent.hertz.service;

import com.rent.hertz.domain.Manufacturer;
import com.rent.hertz.repository.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ManufacturersService {

    @Autowired
    private ManufacturerRepository manufacturerRepository;

    public Manufacturer save(final Manufacturer manufacturer){
        return manufacturerRepository.save(manufacturer);
    }

    public Optional<Manufacturer> findById(final Long idManufacturer){
        return manufacturerRepository.findById(idManufacturer);
    }

    public List<Manufacturer> findAllById(final Iterable<Long> idsManufacturers){
        return manufacturerRepository.findAllById(idsManufacturers);
    }

    public Page<Manufacturer> findAll(final Pageable pageable){
        return manufacturerRepository.findAll(pageable);
    }

    public void deleteById(final Long idManufacturer){
        manufacturerRepository.deleteById(idManufacturer);
    }

    public void deleteAllById(final Iterable<Manufacturer> manufacturers){
        manufacturerRepository.deleteAll(manufacturers);
    }
}
