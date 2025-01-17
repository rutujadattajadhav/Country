package com.rutuja.country.controller;

import com.rutuja.country.exception.ServiceException;
import com.rutuja.country.model.CountryModel;
import com.rutuja.country.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@CrossOrigin
@RestController
public class CountryController {

    Logger log= LoggerFactory.getLogger(this.getClass());


    @Autowired
    private CountryService countryService;

    @GetMapping("/{countryId}")
    public Mono<CountryModel> getCountryById(@PathVariable("countryId") Integer countryId) throws Exception {
         try {
             log.info("got country name and id successfully");
             return countryService.getcountryById(countryId);
         }catch(ServiceException e){
         throw e;
         }
    }

    @GetMapping("/getAllCountry")
    public Flux<CountryModel> getAllCountry() throws Exception {
        return countryService.getAllCountry();
    }

    @GetMapping("/getCountries")
    public Flux<CountryModel> getCountries(@RequestBody List<Integer> countryIds) throws Exception {
        return countryService.getCountries(countryIds);
    }
}
