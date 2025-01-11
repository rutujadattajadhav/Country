package com.rutuja.country.service;

import com.rutuja.country.error.Error;
import com.rutuja.country.exception.ServiceException;
import com.rutuja.country.model.CountryModel;
import com.rutuja.country.repo.CountryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {

    Logger log= LoggerFactory.getLogger(this.getClass());
    @Autowired
    private CountryRepository countryRepository;

    public Mono<CountryModel> getcountryById(Integer countryId) throws ServiceException {
        List<Error> errorlist= new ArrayList<>();

        Mono<CountryModel> modelMono=countryRepository.findById(countryId);
        errorlist.add(new Error("state not found","123"));
        return modelMono.switchIfEmpty(Mono.error(new ServiceException(errorlist)));
    }

    public Flux<CountryModel> getAllCountry() {
        return countryRepository.findAll()
                .switchIfEmpty(Mono.error(new Exception("Countries not found")));
    }


    public Flux<CountryModel> getCountries(List<Integer> countryIds) {
        return countryRepository.findAllById(countryIds)
                .switchIfEmpty(Mono.error(new Exception("Countries not found"))); }
}
