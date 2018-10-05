package com.rent.hertz.service;

import com.rent.hertz.domain.Category;
import com.rent.hertz.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category save(final Category category){
        return categoryRepository.save(category);
    }

    public Optional<Category> findById(final Long idCategory){
        return categoryRepository.findById(idCategory);
    }

    public List<Category> findById(final Iterable<Long> idsCategories){
        return categoryRepository.findAllById(idsCategories);
    }

    public Page<Category> findAll(final Pageable pageable){
        return categoryRepository.findAll(pageable);
    }

    public void deleteById(final Long idCategory){
        categoryRepository.deleteById(idCategory);
    }

    public void deleteById(final Iterable<Category> categories){
        categoryRepository.deleteAll(categories);
    }

}
