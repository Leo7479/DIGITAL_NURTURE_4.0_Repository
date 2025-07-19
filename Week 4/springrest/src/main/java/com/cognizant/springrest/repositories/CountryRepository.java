package com.cognizant.springrest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.springrest.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

}
