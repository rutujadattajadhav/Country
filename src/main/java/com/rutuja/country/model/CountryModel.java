package com.rutuja.country.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "country")
@Data
public class CountryModel {

    @Column(value = "countryId")
    @Id
   private Integer countryId;

    @Column(value = "countryName")
    private String countryName;
}
