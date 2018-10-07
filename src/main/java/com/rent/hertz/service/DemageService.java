package com.rent.hertz.service;

import com.rent.hertz.domain.Demage;
import com.rent.hertz.repository.DemageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DemageService {

    @Autowired
    private DemageRepository demageRepository;

    public Demage save(final Demage demage){
        return demageRepository.save(demage);
    }

    public Optional<Demage> findById(final Long idDemage){
        return demageRepository.findById(idDemage);
    }

    public List<Demage> findAllById(final List<Long> idsDemages){
        return demageRepository.findAllById(idsDemages);
    }

    public Page<Demage> findAll(final Pageable pageable){
        return demageRepository.findAll(pageable);
    }

    public void deleteById(final Long idDemage){
        demageRepository.deleteById(idDemage);
    }

    public void deleteAllById(final List<Demage> demages){
        demageRepository.deleteAll(demages);
    }
}
