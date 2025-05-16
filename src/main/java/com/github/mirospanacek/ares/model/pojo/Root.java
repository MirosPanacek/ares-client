package com.github.mirospanacek.ares.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

/**
 * The class represents root of response from Ares system
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Root {

    @JsonProperty("pocetCelkem")
    private int totalCount;

    @JsonProperty("ekonomickeSubjekty")
    private List<EconomicEntity> economicEntities;

    
    public int getTotalCount() {
        return totalCount;
    }

    
    public List<EconomicEntity> getEconomicEntities() {
        return economicEntities;
    }

    
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    
    public void setEconomicEntities(List<EconomicEntity> economicEntities) {
        this.economicEntities = economicEntities;
    }


    @Override
    public int hashCode() {
        return Objects.hash(economicEntities, totalCount);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Root other = (Root) obj;
        return Objects.equals(economicEntities, other.economicEntities)
                && totalCount == other.totalCount;
    }


    @Override
    public String toString() {
        return "Root [totalCount=" + totalCount + ", economicEntities="
                + economicEntities + "]";
    }

}
