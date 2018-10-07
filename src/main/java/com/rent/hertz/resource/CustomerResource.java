package com.rent.hertz.resource;

import com.rent.hertz.domain.Category;
import com.rent.hertz.domain.Customer;
import com.rent.hertz.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/customer")
public class CustomerResource {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value="/save", method = RequestMethod.POST)
    public Customer save(@RequestBody final Customer customer) {
        return customerService.save(customer);
    }

    @RequestMapping(value="{idCategory}/update", method = RequestMethod.PUT)
    public Customer update(@PathVariable final Long idCategory, @RequestBody final Customer customer) {
        return customerService.save(customer);
    }

    @RequestMapping(value="/list-all", method = RequestMethod.GET)
    public Page<Customer> findAll(final Pageable pageable) {
        return  customerService.findAll(pageable);
    }

    @RequestMapping(value="/{id-category}/find", method = RequestMethod.GET)
    public Optional<Customer> findById(@PathVariable final Long idCustomer) {
        return customerService.findById(idCustomer);
    }

    @RequestMapping(value="/{idsCustomers}/find-all", method = RequestMethod.GET)
    public List<Customer> findAllById(@PathVariable final List<Long> idsCustomers){
        return customerService.findAllById(idsCustomers);
    }

    @RequestMapping(value="/{id-category}/delete", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable final Long idCustomer) {
        customerService.deleteById(idCustomer);
    }

    @RequestMapping(value="/delete-all", method = RequestMethod.DELETE)
    public void deleteById(@RequestBody final List<Customer> customers) {
        customerService.deleteAllById(customers);
    }

}
