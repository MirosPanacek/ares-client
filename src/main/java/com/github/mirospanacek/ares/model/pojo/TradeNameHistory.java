package com.github.mirospanacek.ares.model.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDate;
import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public class TradeNameHistory {

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate validFrom;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate validTo;

    private String tradeName;
    private boolean primaryRecord;
    
    public LocalDate getValidFrom() {
        return validFrom;
    }
    
    public LocalDate getValidTo() {
        return validTo;
    }
    
    public String getTradeName() {
        return tradeName;
    }
    
    public boolean isPrimaryRecord() {
        return primaryRecord;
    }
    
    public void setValidFrom(LocalDate validFrom) {
        this.validFrom = validFrom;
    }
    
    public void setValidTo(LocalDate validTo) {
        this.validTo = validTo;
    }
    
    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }
    
    public void setPrimaryRecord(boolean primaryRecord) {
        this.primaryRecord = primaryRecord;
    }

    @Override
    public int hashCode() {
        return Objects.hash(primaryRecord, tradeName, validFrom, validTo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TradeNameHistory other = (TradeNameHistory) obj;
        return primaryRecord == other.primaryRecord
                && Objects.equals(tradeName, other.tradeName)
                && Objects.equals(validFrom, other.validFrom)
                && Objects.equals(validTo, other.validTo);
    }

    @Override
    public String toString() {
        return "TradeNameHistory [validFrom=" + validFrom + ", validTo="
                + validTo + ", tradeName=" + tradeName + ", primaryRecord="
                + primaryRecord + "]";
    }

}
