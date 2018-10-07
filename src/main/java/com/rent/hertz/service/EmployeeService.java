package com.rent.hertz.service;

import com.rent.hertz.domain.Employee;
import com.rent.hertz.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee save(final Employee demage){
        return employeeRepository.save(demage);
    }

    public Optional<Employee> findById(final Long idEmployee){
        return employeeRepository.findById(idEmployee);
    }

    public List<Employee> findAllById(final List<Long> idsEmployees){
        return employeeRepository.findAllById(idsEmployees);
    }

    public Page<Employee> findAll(final Pageable pageable){
        return employeeRepository.findAll(pageable);
    }

    public void deleteById(final Long idEmployee){
        employeeRepository.deleteById(idEmployee);
    }

    public void deleteAllById(final List<Employee> employees){
        employeeRepository.deleteAll(employees);
    }
}
