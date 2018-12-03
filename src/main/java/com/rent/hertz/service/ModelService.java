package com.rent.hertz.service;

import com.rent.hertz.domain.Model;
import com.rent.hertz.repository.ModelRepository;
import com.rent.hertz.service.interfaces.HertzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModelService implements HertzService<Model> {

    @Autowired
    private ModelRepository modelRepository;

	@Override
	public Model save(final Model model){
		return modelRepository.save(model);
	}

	@Override
	public Model update(final Model model){
		return modelRepository.save(model);
	}

	@Override
	public Optional<Model> findById(final String idModel){
		return modelRepository.findById(idModel);
	}

	@Override
	public List<Model> findAll(){
		return modelRepository.findAll();
	}

	@Override
	public void delete(final Model model){
		modelRepository.delete(model);
	}

}
