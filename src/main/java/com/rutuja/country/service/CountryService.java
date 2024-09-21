package com.rutuja.country.service;

import com.rutuja.country.model.CountryModel;
import com.rutuja.country.repo.CountryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {

    Logger log= LoggerFactory.getLogger(this.getClass());
    @Autowired
    private CountryRepository countryRepository;

    public CountryModel getcountryById(Integer countryId) throws Exception {
       if(countryRepository.findById(countryId).isPresent()){
           log.debug("Id is present in DB");
           return countryRepository.findById(countryId).get();
       }
       throw new Exception("country not found");
    }

    public List<CountryModel> getAllCountry() throws Exception {
        List<CountryModel> listOfcountry=new ArrayList<>();
        Iterable<CountryModel> countries=countryRepository.findAll();
        if(countries!=null){
            countries.forEach((country)->{
                listOfcountry.add(country) ;
            });
            return listOfcountry;
        }
        throw new Exception("Countrys not found");
    }

    public List<CountryModel> getCountries(List<Integer> countryIds) throws Exception {
        List<CountryModel> listOfCountry=new ArrayList<>();
        Iterable<CountryModel> countries=countryRepository.findAllById(countryIds);
        if(countries!=null){
            countries.forEach((country)->{
                listOfCountry.add(country);
            });
            return listOfCountry;
        }
        throw new Exception("countries not found");
    }
}
