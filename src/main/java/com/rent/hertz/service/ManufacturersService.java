package com.rent.hertz.service;

import com.rent.hertz.domain.Employee;
import com.rent.hertz.domain.Manufacturer;
import com.rent.hertz.repository.ManufacturerRepository;
import com.rent.hertz.service.interfaces.HertzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ManufacturersService implements HertzService<Manufacturer> {

    @Autowired
    private ManufacturerRepository manufacturerRepository;

	@Override
	public Manufacturer save(final Manufacturer manufacturer){
		return manufacturerRepository.save(manufacturer);
	}

	@Override
	public Manufacturer update(final Manufacturer manufacturer){
		return manufacturerRepository.save(manufacturer);
	}

	@Override
	public Optional<Manufacturer> findById(final String idManufacturer){
		return manufacturerRepository.findById(idManufacturer);
	}

	@Override
	public List<Manufacturer> findAll(){
		return manufacturerRepository.findAll();
	}

	@Override
	public void delete(final Manufacturer manufacturer){
		manufacturerRepository.delete(manufacturer);
	}
}
