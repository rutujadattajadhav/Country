//package com.rutuja.country.service;
//
//import com.rutuja.country.model.CountryModel;
//import com.rutuja.country.repo.CountryRepository;
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
//import java.util.Optional;
//
//@RunWith(MockitoJUnitRunner.Silent.class)
//public class CountryServiceTest {
//    @InjectMocks
//    private CountryService countryService;
//
//    @Mock
//    private CountryRepository countryRepository;
//
//    @Mock
//    private Optional<CountryModel> optional;
//
//   @Test
//    public void getCountryById() throws Exception {
//      CountryModel countryModel1 =new CountryModel();
//       countryModel1.setCountryId(1);
//       countryModel1.setCountryName("Canada");
//       Optional<CountryModel> countryModell=Optional.of(countryModel1);
//       Mockito.when(countryRepository.findById(Mockito.anyInt())).thenReturn(countryModell);
//       Mockito.when(optional.get()).thenReturn(countryModel1);
//       CountryModel countryModel =countryService.getcountryById(1);
//       Assert.assertEquals(countryModel1.toString(),countryModel.toString());
//    }
//
//    @Test(expected = Exception.class)
//    public void getCountryByIdException() throws Exception {
//        CountryModel countryModel =countryService.getcountryById(1);
//    }
//
//    @Test
//    public void getAllCountrySuccess() throws Exception {
//        List<CountryModel> countryModelList=new ArrayList<>();
//        CountryModel countryModel1=new CountryModel();
//        countryModel1.setCountryId(1);
//        countryModel1.setCountryName("Canada");
//        countryModelList.add(countryModel1);
//        Mockito.when(countryRepository.findAll()).thenReturn(countryModelList);
//        List<CountryModel> countryModel =countryService.getAllCountry();
//        Assert.assertEquals(countryModelList.toString(),countryModel.toString());
//    }
//
//    @Test(expected = Exception.class)
//    public void getAllCountryException() throws Exception {
//        List<CountryModel> countryModelList=new ArrayList<>();
//        Mockito.when(countryRepository.findAll()).thenReturn(null);
//        List<CountryModel> countryModel =countryService.getAllCountry();
//    }
//
//    @Test
//    public void getCountrySuccess() throws Exception {
//        List<CountryModel> countryModelList=new ArrayList<>();
//        CountryModel countryModel1=new CountryModel();
//        countryModel1.setCountryId(1);
//        countryModel1.setCountryName("Canada");
//        countryModelList.add(countryModel1);
//        Mockito.when(countryRepository.findAllById(Mockito.anyIterable())).thenReturn(countryModelList);
//        List<Integer> integerList=new ArrayList<>();
//        integerList.add(1);
//        List<CountryModel> countryModel =countryService.getCountries(integerList);
//        Assert.assertEquals(countryModelList.toString(),countryModel.toString());
//    }
//
//    @Test(expected = Exception.class)
//    public void getCountryException() throws Exception {
//        List<CountryModel> countryModelList=new ArrayList<>();
//        Mockito.when(countryRepository.findAllById(Mockito.anyIterable())).thenReturn(null);
//        List<Integer> integerList=new ArrayList<>();
//        integerList.add(1);
//        List<CountryModel> countryModel =countryService.getCountries(integerList);
//    }
//}
