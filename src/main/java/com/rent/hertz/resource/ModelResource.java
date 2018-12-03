package com.rent.hertz.resource;

import com.rent.hertz.domain.Model;
import com.rent.hertz.resource.interfaces.HertzResource;
import com.rent.hertz.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/models")
public class ModelResource implements HertzResource<Model> {

    @Autowired
    private ModelService modelService;

    @Override @RequestMapping(method = RequestMethod.POST)
    public Model save(@RequestBody final Model model){
        return modelService.save(model);
    }

    @Override @RequestMapping(method = RequestMethod.PUT)
    public Model update(@RequestBody final Model model){
        return modelService.save(model);
    }

    @Override @RequestMapping(method = RequestMethod.GET)
    public List<Model> findAll(){
        return  modelService.findAll();
    }

    @Override @RequestMapping(value="/{idModel}", method = RequestMethod.GET)
    public Optional<Model> findById(@PathVariable final String idModel){
        return modelService.findById(idModel);
    }

    @Override @RequestMapping(value="/{idModel}", method = RequestMethod.DELETE)
    public void delete(@PathVariable final String idModel){
        modelService.findById(idModel)
                .ifPresent(this::accept);
    }

    private void accept(Model model) {
        modelService.delete(model);
    }

}
