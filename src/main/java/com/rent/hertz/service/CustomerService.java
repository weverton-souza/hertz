package com.rent.hertz.service;

import com.rent.hertz.domain.Customer;
import com.rent.hertz.repository.CustomerRepository;
import com.rent.hertz.service.interfaces.HertzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements HertzService<Customer> {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer save(final Customer customer){
        return customerRepository.save(customer);
    }

    @Override
    public Customer update(final Customer customer){
        return customerRepository.save(customer);
    }

    @Override
    public Optional<Customer> findById(final String idCustomer){
        return customerRepository.findById(idCustomer);
    }

    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    @Override
    public void delete(final Customer customer){
        customerRepository.delete(customer);
    }
}
