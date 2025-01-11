//package com.rutuja.country.controller;
//
//import com.rutuja.country.model.CountryModel;
//import com.rutuja.country.service.CountryService;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.MockitoJUnitRunner;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RunWith(MockitoJUnitRunner.Silent.class)
//public class CountryControllerTest {
//    @InjectMocks
//    private CountryController countryController;
//
//    @Mock
//    private CountryService countryService;
//
//    @Test
//    public void getcountryByIdSuccess() throws Exception {
//        Mockito.when(countryService.getcountryById(Mockito.anyInt())).thenReturn(new CountryModel());
//        CountryModel countryModel =countryController.getCountryById(1);
//        Assert.assertEquals(new CountryModel().toString(), countryModel.toString());
//    }
//
//    @Test
//    public void getAllDistrict() throws Exception {
//        List<CountryModel> countryModels=new ArrayList<>();
//        Mockito.when(countryService.getAllCountry()).thenReturn(countryModels);
//        List<CountryModel> allCountry=countryController.getAllCountry();
//        Assert.assertEquals(countryModels.toString(),allCountry.toString());
//    }
//
//    @Test
//    public void getDistrict() throws Exception {
//        List<CountryModel> countryModels=new ArrayList<>();
//        Mockito.when(countryService.getAllCountry()).thenReturn(countryModels);
//        List<Integer> integerList=new ArrayList<>();
//        integerList.add(1);
//        List<CountryModel> allCountry=countryController.getCountries(integerList);
//        Assert.assertEquals(countryModels.toString(),allCountry.toString());
//    }
//}
