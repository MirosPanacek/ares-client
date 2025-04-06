package com.github.mirospanacek.ares.model.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class TradeNameHistory {

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate validFrom;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate validTo;

    private String tradeName;
    private boolean primaryRecord;

    // Getters and Setters
}
