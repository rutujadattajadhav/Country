package com.rutuja.country.controller;

import com.rutuja.country.model.CountryModel;
import com.rutuja.country.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/{countryId}")
    public CountryModel getCountryById(@PathVariable("countryId") Integer countryId) throws Exception {
      return countryService.getcountryById(countryId);
    }

    @GetMapping("/getAllCountry")
    public List<CountryModel> getAllCountry() throws Exception {
        return countryService.getAllCountry();
    }

    @GetMapping("/getCountries")
    public List<CountryModel> getCountries(@RequestBody List<Integer> countryIds) throws Exception {
        return countryService.getCountries(countryIds);
    }
}
