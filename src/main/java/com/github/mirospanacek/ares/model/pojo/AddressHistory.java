package com.github.mirospanacek.ares.model.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class AddressHistory {
    private Address address;
    private boolean primaryRecord;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate validFrom;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate validTo;

    // Getters and Setters
}
