package com.rutuja.country.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "country")
@Data
public class CountryModel {

    @Column(name = "countryId")
    @Id
   private Integer countryId;

    @Column(name = "countryName")
    private String countryName;
}
