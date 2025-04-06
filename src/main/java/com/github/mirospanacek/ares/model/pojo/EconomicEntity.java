package com.github.mirospanacek.ares.model.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDate;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EconomicEntity {

    private String ico;

    @JsonProperty("obchodniJmeno")
    private String tradeName;

    private Address address;

    private String legalForm;
    private String taxOffice;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate establishmentDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate terminationDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate updateDate;

    private String vatNumber;

    @JsonProperty("icoId")
    private String icoId;

    private DeliveryAddress deliveryAddress;

    private RegistrationStatus registrationStatus;

    private String primarySource;

    @JsonProperty("dalsiUdaje")
    private List<AdditionalData> additionalData;

    private List<String> czNace;

    private String szrSubRegister;
    private String euVatId;

    // Getters and Setters
}
