package com.rutuja.country.repo;

import com.rutuja.country.model.CountryModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<CountryModel,Integer> {
}
