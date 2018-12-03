package com.rent.hertz.resource;

import com.rent.hertz.domain.Customer;
import com.rent.hertz.resource.interfaces.HertzResource;
import com.rent.hertz.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/customers")
public class CustomerResource implements HertzResource<Customer> {

    @Autowired
    private CustomerService customerService;

    @Override @RequestMapping(method = RequestMethod.POST)
    public Customer save(@RequestBody final Customer customer){
        return customerService.save(customer);
    }

    @Override @RequestMapping(method = RequestMethod.PUT)
    public Customer update(@RequestBody final Customer customer){
        return customerService.save(customer);
    }

    @Override @RequestMapping(method = RequestMethod.GET)
    public List<Customer> findAll(){
        return  customerService.findAll();
    }

    @Override @RequestMapping(value="/{idCustomer}", method = RequestMethod.GET)
    public Optional<Customer> findById(@PathVariable final String idCustomer){
        return customerService.findById(idCustomer);
    }

    @Override @RequestMapping(value="/{idCustomer}", method = RequestMethod.DELETE)
    public void delete(@PathVariable final String idCustomer){
        customerService.findById(idCustomer)
                .ifPresent(this::accept);
    }

    private void accept(Customer customer) {
        customerService.delete(customer);
    }
}
