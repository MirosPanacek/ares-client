package com.github.mirospanacek.ares.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Root {

    @JsonProperty("pocetCelkem")
    private int totalCount;

    @JsonProperty("ekonomickeSubjekty")
    private List<EconomicEntity> economicEntities;

    // Getters and Setters
}
