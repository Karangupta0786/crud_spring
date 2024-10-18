package com.codeelevate.crud_spring.service;

import com.codeelevate.crud_spring.model.Developer;
import com.codeelevate.crud_spring.repository.DevRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevService {
    @Autowired
    DevRepository devRepository;

    public void addDev(Developer developer)
    {
        devRepository.save(developer);
    }

    public List<Developer> getAllDev(){
        return devRepository.findAll();
    }

    public Developer getById(int id){
        if (devRepository.findById(id).isPresent()) {
            return devRepository.findById(id).get();
        }
        return null;
    }


}
