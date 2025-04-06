package com.github.mirospanacek.ares.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {
    private String countryCode;
    private String countryName;
    private int regionCode;
    private String regionName;
    private int districtCode;
    private String districtName;
    private int municipalityCode;
    private String municipalityName;
    private int administrativeDistrictCode;
    private String administrativeDistrictName;
    private int cityDistrictCode;
    private String cityDistrictName;
    private int cityPartCode;
    private int streetCode;
    private String cityPartName;
    private String streetName;
    private int buildingNumber;
    private String addressComplement;
    private int partOfMunicipalityCode;
    private int orientationNumber;
    private String orientationLetter;
    private String partOfMunicipalityName;
    private long addressPlaceCode;
    private int postalCode;
    private String textualAddress;
    private String addressNumber;
    private boolean addressStandardized;
    private String postalCodeText;
    private int buildingNumberType;

    
}
