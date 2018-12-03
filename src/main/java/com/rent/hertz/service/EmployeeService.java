package com.rent.hertz.service;

import com.rent.hertz.domain.Employee;
import com.rent.hertz.repository.EmployeeRepository;
import com.rent.hertz.service.interfaces.HertzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements HertzService<Employee> {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee save(final Employee employee){
        return employeeRepository.save(employee);
    }

    @Override
    public Employee update(final Employee employee){
        return employeeRepository.save(employee);
    }

    @Override
    public Optional<Employee> findById(final String idEmployee){
        return employeeRepository.findById(idEmployee);
    }

    @Override
    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    @Override
    public void delete(final Employee employee){
        employeeRepository.delete(employee);
    }
}
