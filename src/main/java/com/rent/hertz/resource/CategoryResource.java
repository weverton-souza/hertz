package com.rent.hertz.resource;

import com.rent.hertz.domain.Category;
import com.rent.hertz.resource.interfaces.HertzResource;
import com.rent.hertz.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/categories")
public class CategoryResource implements HertzResource<Category> {

    @Autowired
    private CategoryService categoryService;

    @Override @RequestMapping(method = RequestMethod.POST)
    public Category save(@RequestBody final Category category){
        return categoryService.save(category);
    }

    @Override @RequestMapping(method = RequestMethod.PUT)
    public Category update(@RequestBody final Category category){
        return categoryService.save(category);
    }

    @Override @RequestMapping(method = RequestMethod.GET)
    public List<Category> findAll(){
        return  categoryService.findAll();
    }

    @Override @RequestMapping(value="/{idCategory}", method = RequestMethod.GET)
    public Optional<Category> findById(@PathVariable final String idCategory){
        return categoryService.findById(idCategory);
    }

    @Override @RequestMapping(value="/{idCategory}", method = RequestMethod.DELETE)
    public void delete(@PathVariable final String idCategory){
	    categoryService.findById(idCategory)
			    .ifPresent(this::accept);
    }

	private void accept(Category category) {
		categoryService.delete(category);
	}
}
