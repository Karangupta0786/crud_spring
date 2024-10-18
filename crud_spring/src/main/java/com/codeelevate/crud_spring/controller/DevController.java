package com.codeelevate.crud_spring.controller;

import com.codeelevate.crud_spring.model.Developer;
import com.codeelevate.crud_spring.repository.DevRepository;
import com.codeelevate.crud_spring.service.DevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DevController
{
    @Autowired
    DevService devService;
    @GetMapping("/get")
    public List<Developer> getDeveloper()
    {
        return devService.getAllDev();
    }
    @PostMapping
    public String add(@RequestBody Developer developer)
    {
        devService.addDev(developer);
        return "Added successfully.";
    }

    @GetMapping("/get/{id}")
    public Developer getById(@PathVariable int id)
    {
            return devService.getById(id);
    }


}
