package com.github.mirospanacek.ares.model.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDate;
import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddressHistory {
    private Address address;
    private boolean primaryRecord;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate validFrom;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate validTo;

    
    public Address getAddress() {
        return address;
    }

    
    public boolean isPrimaryRecord() {
        return primaryRecord;
    }

    
    public LocalDate getValidFrom() {
        return validFrom;
    }

    
    public LocalDate getValidTo() {
        return validTo;
    }

    
    public void setAddress(Address address) {
        this.address = address;
    }

    
    public void setPrimaryRecord(boolean primaryRecord) {
        this.primaryRecord = primaryRecord;
    }

    
    public void setValidFrom(LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    
    public void setValidTo(LocalDate validTo) {
        this.validTo = validTo;
    }


    @Override
    public int hashCode() {
        return Objects.hash(address, primaryRecord, validFrom, validTo);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AddressHistory other = (AddressHistory) obj;
        return Objects.equals(address, other.address)
                && primaryRecord == other.primaryRecord
                && Objects.equals(validFrom, other.validFrom)
                && Objects.equals(validTo, other.validTo);
    }


    @Override
    public String toString() {
        return "AddressHistory [address=" + address + ", primaryRecord="
                + primaryRecord + ", validFrom=" + validFrom + ", validTo="
                + validTo + "]";
    }

}
