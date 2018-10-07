package com.rent.hertz.service;

import com.rent.hertz.domain.Customer;
import com.rent.hertz.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer save(final Customer customer){
        return customerRepository.save(customer);
    }

    public Optional<Customer> findById(final Long idCustomer){
        return customerRepository.findById(idCustomer);
    }

    public List<Customer> findAllById(final List<Long> idsCustomers){
        return customerRepository.findAllById(idsCustomers);
    }

    public Page<Customer> findAll(final Pageable pageable){
        return customerRepository.findAll(pageable);
    }

    public void deleteById(final Long idCategory){
        customerRepository.deleteById(idCategory);
    }

    public void deleteAllById(final List<Customer> customers){
        customerRepository.deleteAll(customers);
    }

}
