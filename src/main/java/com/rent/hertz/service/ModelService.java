package com.rent.hertz.service;

import com.rent.hertz.domain.Model;
import com.rent.hertz.repository.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModelService {

    @Autowired
    private ModelRepository modelRepository;

    public Model save(final Model model){
        return modelRepository.save(model);
    }

    public Optional<Model> findById(final Long idModel){
        return modelRepository.findById(idModel);
    }

    public List<Model> findAllById(final List<Long> idsModels){
        return modelRepository.findAllById(idsModels);
    }

    public Page<Model> findAll(final Pageable pageable){
        return modelRepository.findAll(pageable);
    }

    public void deleteById(final Long idModel){
        modelRepository.deleteById(idModel);
    }

    public void deleteAllById(final List<Model> models){
        modelRepository.deleteAll(models);
    }

}
