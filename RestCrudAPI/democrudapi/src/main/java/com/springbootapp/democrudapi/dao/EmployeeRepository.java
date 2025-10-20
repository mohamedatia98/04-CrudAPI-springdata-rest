package com.springbootapp.democrudapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.springbootapp.democrudapi.entity.Employee;

// Entity Type -- Primary Key 
// this will save much work of 70% code from entity manager work and 
// creating interface and implentation files classes 

//@RepositoryRestResource(path = "hola") // changing the default ( employees-name )

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
