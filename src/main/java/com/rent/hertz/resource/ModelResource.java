package com.rent.hertz.resource;

import com.rent.hertz.domain.Model;
import com.rent.hertz.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/model")
public class ModelResource {

    @Autowired
    private ModelService modelService;

    @RequestMapping(value="/save", method = RequestMethod.POST)
    public Model save(@RequestBody final Model model){
        return modelService.save(model);
    }

    @RequestMapping(value="{idModel}/update", method = RequestMethod.PUT)
    public Model update(@PathVariable final Long idModel, @RequestBody final Model model){
        return modelService.save(model.setId(idModel));
    }

    @RequestMapping(value="/list-all", method = RequestMethod.GET)
    public Page<Model> findAll(final Pageable pageable){
        return  modelService.findAll(pageable);
    }

    @RequestMapping(value="/{idModel}/find", method = RequestMethod.GET)
    public Optional<Model> findById(@PathVariable final Long idModel){
        return modelService.findById(idModel);
    }

    @RequestMapping(value="/{idsModels}/find-all", method = RequestMethod.GET)
    public List<Model> findAllById(@PathVariable final List<Long> idsModels){
        return modelService.findAllById(idsModels);
    }

    @RequestMapping(value="/{idManufacturer}/delete", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable final Long idModel){
        modelService.deleteById(idModel);
    }

    @RequestMapping(value="/delete-all", method = RequestMethod.DELETE)
    public void deleteAllById(@RequestBody final List<Model> models){
        modelService.deleteAllById(models);
    }

}
