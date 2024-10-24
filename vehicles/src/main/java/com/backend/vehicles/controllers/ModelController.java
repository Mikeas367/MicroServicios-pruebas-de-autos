package com.backend.vehicles.controllers;

import com.backend.vehicles.models.Model;
import com.backend.vehicles.services.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/models")
public class ModelController {
    @Autowired
    private ModelService modelService;

    @GetMapping
    public List<Model> getAllModels() {
        return modelService.findAll();
    }
    @GetMapping("/{id}")
    public Model getModelById(@PathVariable int id) {
        return modelService.findById(id);
    }

    @PostMapping
    public Model createModel(@RequestBody Model model) {
        return modelService.save(model);
    }

    @DeleteMapping("/{id}")
    public void deleteModel(@PathVariable int id) {
        modelService.delete(id);
    }
}