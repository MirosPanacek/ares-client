package com.github.mirospanacek.ares.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeliveryAddress{

    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    
    public String getAddressLine1() {
        return addressLine1;
    }
    
    public String getAddressLine2() {
        return addressLine2;
    }
    
    public String getAddressLine3() {
        return addressLine3;
    }
    
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }
    
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }
    
    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressLine1, addressLine2, addressLine3);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DeliveryAddress other = (DeliveryAddress) obj;
        return Objects.equals(addressLine1, other.addressLine1)
                && Objects.equals(addressLine2, other.addressLine2)
                && Objects.equals(addressLine3, other.addressLine3);
    }

    @Override
    public String toString() {
        return "DeliveryAddress [addressLine1=" + addressLine1
                + ", addressLine2=" + addressLine2 + ", addressLine3="
                + addressLine3 + "]";
    }

}
