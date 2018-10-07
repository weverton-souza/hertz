package com.rent.hertz.resource;

import com.rent.hertz.domain.Category;
import com.rent.hertz.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/category")
public class CategoryResource {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value="/save", method = RequestMethod.POST)
    public Category save(@RequestBody final Category category){
        return categoryService.save(category);
    }

    @RequestMapping(value="{idCategory}/update", method = RequestMethod.PUT)
    public Category update(@PathVariable final Long idCategory, @RequestBody final Category category){
        return categoryService.save(category.setId(idCategory));
    }

    @RequestMapping(value="/list-all", method = RequestMethod.GET)
    public Page<Category> findAll(final Pageable pageable){
        return  categoryService.findAll(pageable);
    }

    @RequestMapping(value="/{idCategory}/find", method = RequestMethod.GET)
    public Optional<Category> findById(@PathVariable final Long idCategory){
        return categoryService.findById(idCategory);
    }

    @RequestMapping(value="/{idsCategories}/find-all", method = RequestMethod.GET)
    public List<Category> findById(@PathVariable final List<Long> idsCategories){
        return categoryService.findById(idsCategories);
    }

    @RequestMapping(value="/{idCategory}/delete", method = RequestMethod.DELETE)
    public void deleteById(final Long idCategory){
        categoryService.deleteById(idCategory);
    }

    @RequestMapping(value="/delete-all", method = RequestMethod.DELETE)
    public void deleteById(@RequestBody final List<Category> categories){
        categoryService.deleteAllById(categories);
    }

}
