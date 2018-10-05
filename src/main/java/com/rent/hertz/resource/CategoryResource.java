package com.rent.hertz.resource;

import com.rent.hertz.domain.Category;
import com.rent.hertz.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/category")
public class CategoryResource {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value="/save", method = RequestMethod.GET)
    public Category save(final Category category){
        return categoryService.save(category);
    }

    @RequestMapping(value="/list-all", method = RequestMethod.GET)
    public Page<Category> findAll(final Pageable pageable){
        return  categoryService.findAll(pageable);
    }

}
