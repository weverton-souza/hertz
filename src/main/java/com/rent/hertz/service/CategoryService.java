package com.rent.hertz.service;

import com.rent.hertz.domain.Category;
import com.rent.hertz.repository.CategoryRepository;
import com.rent.hertz.service.interfaces.HertzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService implements HertzService<Category> {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category save(final Category category){
        return categoryRepository.save(category);
    }

	@Override
    public Category update(final Category category){
        return categoryRepository.save(category);
    }

	@Override
    public Optional<Category> findById(final String idCategory){
        return categoryRepository.findById(idCategory);
    }

	@Override
    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

	@Override
    public void delete(final Category category){
        categoryRepository.delete(category);
    }

}
