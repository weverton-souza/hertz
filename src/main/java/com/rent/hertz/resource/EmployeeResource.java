package com.rent.hertz.resource;

import com.rent.hertz.domain.Employee;
import com.rent.hertz.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/employee")
public class EmployeeResource {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value="/save", method = RequestMethod.POST)
    public Employee save(@RequestBody final Employee employee) {
        return employeeService.save(employee);
    }

    @RequestMapping(value="{idEmployee}/update", method = RequestMethod.PUT)
    public Employee update(@PathVariable Long idEmployee, @RequestBody final Employee employee) {
        return employeeService.save(employee);
    }

    @RequestMapping(value="/list-all", method = RequestMethod.GET)
    public Page<Employee> findAll(final Pageable pageable) {
        return  employeeService.findAll(pageable);
    }

    @RequestMapping(value="/{idDemage}/find", method = RequestMethod.GET)
    public Optional<Employee> findById(@PathVariable final Long idEmployee) {
        return employeeService.findById(idEmployee);
    }

    @RequestMapping(value="{idsEmployee}/find-all", method = RequestMethod.GET)
    public List<Employee> findAllById(@PathVariable final List<Long> idsEmployee){
        return employeeService.findAllById(idsEmployee);
    }

    @RequestMapping(value="/{idEmployee}/delete", method = RequestMethod.DELETE)
    public void deleteById(final Long idEmployee) {
        employeeService.deleteById(idEmployee);
    }

    @RequestMapping(value="/delete-all", method = RequestMethod.DELETE)
    public void deleteAllById(@RequestBody final List<Employee> employees) {
        employeeService.deleteAllById(employees);
    }

}
