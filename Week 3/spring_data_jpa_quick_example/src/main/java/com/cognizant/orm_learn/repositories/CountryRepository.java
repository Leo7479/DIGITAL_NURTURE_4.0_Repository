package com.cognizant.orm_learn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.orm_learn.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country,String>{

}
