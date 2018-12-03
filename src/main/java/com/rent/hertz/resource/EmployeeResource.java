package com.rent.hertz.resource;

import com.rent.hertz.domain.Employee;
import com.rent.hertz.resource.interfaces.HertzResource;
import com.rent.hertz.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/employees")
public class EmployeeResource implements HertzResource<Employee> {

    @Autowired
    private EmployeeService employeeService;

    @Override @RequestMapping(method = RequestMethod.POST)
    public Employee save(@RequestBody final Employee employee){
        return employeeService.save(employee);
    }

    @Override @RequestMapping(method = RequestMethod.PUT)
    public Employee update(@RequestBody final Employee employee){
        return employeeService.save(employee);
    }

    @Override @RequestMapping(method = RequestMethod.GET)
    public List<Employee> findAll(){
        return  employeeService.findAll();
    }

    @Override @RequestMapping(value="/{idEmployee}", method = RequestMethod.GET)
    public Optional<Employee> findById(@PathVariable final String idEmployee){
        return employeeService.findById(idEmployee);
    }

    @Override @RequestMapping(value="/{idEmployee}", method = RequestMethod.DELETE)
    public void delete(@PathVariable final String idEmployee){
        employeeService.findById(idEmployee)
                .ifPresent(this::accept);
    }

    private void accept(Employee employee) {
        employeeService.delete(employee);
    }
}
