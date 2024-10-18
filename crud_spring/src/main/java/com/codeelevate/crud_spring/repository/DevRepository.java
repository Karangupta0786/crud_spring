package com.codeelevate.crud_spring.repository;

import com.codeelevate.crud_spring.model.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevRepository extends JpaRepository<Developer, Integer> {

}
