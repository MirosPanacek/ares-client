package com.github.mirospanacek.ares.model.pojo;

import java.util.Objects;

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
    
    public String getCountryCode() {
        return countryCode;
    }
    
    public String getCountryName() {
        return countryName;
    }
    
    public int getRegionCode() {
        return regionCode;
    }
    
    public String getRegionName() {
        return regionName;
    }
    
    public int getDistrictCode() {
        return districtCode;
    }
    
    public String getDistrictName() {
        return districtName;
    }
    
    public int getMunicipalityCode() {
        return municipalityCode;
    }
    
    public String getMunicipalityName() {
        return municipalityName;
    }
    
    public int getAdministrativeDistrictCode() {
        return administrativeDistrictCode;
    }
    
    public String getAdministrativeDistrictName() {
        return administrativeDistrictName;
    }
    
    public int getCityDistrictCode() {
        return cityDistrictCode;
    }
    
    public String getCityDistrictName() {
        return cityDistrictName;
    }
    
    public int getCityPartCode() {
        return cityPartCode;
    }
    
    public int getStreetCode() {
        return streetCode;
    }
    
    public String getCityPartName() {
        return cityPartName;
    }
    
    public String getStreetName() {
        return streetName;
    }
    
    public int getBuildingNumber() {
        return buildingNumber;
    }
    
    public String getAddressComplement() {
        return addressComplement;
    }
    
    public int getPartOfMunicipalityCode() {
        return partOfMunicipalityCode;
    }
    
    public int getOrientationNumber() {
        return orientationNumber;
    }
    
    public String getOrientationLetter() {
        return orientationLetter;
    }
    
    public String getPartOfMunicipalityName() {
        return partOfMunicipalityName;
    }
    
    public long getAddressPlaceCode() {
        return addressPlaceCode;
    }
    
    public int getPostalCode() {
        return postalCode;
    }
    
    public String getTextualAddress() {
        return textualAddress;
    }
    
    public String getAddressNumber() {
        return addressNumber;
    }
    
    public boolean isAddressStandardized() {
        return addressStandardized;
    }
    
    public String getPostalCodeText() {
        return postalCodeText;
    }
    
    public int getBuildingNumberType() {
        return buildingNumberType;
    }
    
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    
    public void setRegionCode(int regionCode) {
        this.regionCode = regionCode;
    }
    
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
    
    public void setDistrictCode(int districtCode) {
        this.districtCode = districtCode;
    }
    
    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }
    
    public void setMunicipalityCode(int municipalityCode) {
        this.municipalityCode = municipalityCode;
    }
    
    public void setMunicipalityName(String municipalityName) {
        this.municipalityName = municipalityName;
    }
    
    public void setAdministrativeDistrictCode(int administrativeDistrictCode) {
        this.administrativeDistrictCode = administrativeDistrictCode;
    }
    
    public void setAdministrativeDistrictName(String administrativeDistrictName) {
        this.administrativeDistrictName = administrativeDistrictName;
    }
    
    public void setCityDistrictCode(int cityDistrictCode) {
        this.cityDistrictCode = cityDistrictCode;
    }
    
    public void setCityDistrictName(String cityDistrictName) {
        this.cityDistrictName = cityDistrictName;
    }
    
    public void setCityPartCode(int cityPartCode) {
        this.cityPartCode = cityPartCode;
    }
    
    public void setStreetCode(int streetCode) {
        this.streetCode = streetCode;
    }
    
    public void setCityPartName(String cityPartName) {
        this.cityPartName = cityPartName;
    }
    
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    
    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }
    
    public void setAddressComplement(String addressComplement) {
        this.addressComplement = addressComplement;
    }
    
    public void setPartOfMunicipalityCode(int partOfMunicipalityCode) {
        this.partOfMunicipalityCode = partOfMunicipalityCode;
    }
    
    public void setOrientationNumber(int orientationNumber) {
        this.orientationNumber = orientationNumber;
    }
    
    public void setOrientationLetter(String orientationLetter) {
        this.orientationLetter = orientationLetter;
    }
    
    public void setPartOfMunicipalityName(String partOfMunicipalityName) {
        this.partOfMunicipalityName = partOfMunicipalityName;
    }
    
    public void setAddressPlaceCode(long addressPlaceCode) {
        this.addressPlaceCode = addressPlaceCode;
    }
    
    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
    
    public void setTextualAddress(String textualAddress) {
        this.textualAddress = textualAddress;
    }
    
    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }
    
    public void setAddressStandardized(boolean addressStandardized) {
        this.addressStandardized = addressStandardized;
    }
    
    public void setPostalCodeText(String postalCodeText) {
        this.postalCodeText = postalCodeText;
    }
    
    public void setBuildingNumberType(int buildingNumberType) {
        this.buildingNumberType = buildingNumberType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressComplement, addressNumber, addressPlaceCode,
                addressStandardized, administrativeDistrictCode,
                administrativeDistrictName, buildingNumber, buildingNumberType,
                cityDistrictCode, cityDistrictName, cityPartCode, cityPartName,
                countryCode, countryName, districtCode, districtName,
                municipalityCode, municipalityName, orientationLetter,
                orientationNumber, partOfMunicipalityCode,
                partOfMunicipalityName, postalCode, postalCodeText, regionCode,
                regionName, streetCode, streetName, textualAddress);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Address other = (Address) obj;
        return Objects.equals(addressComplement, other.addressComplement)
                && Objects.equals(addressNumber, other.addressNumber)
                && addressPlaceCode == other.addressPlaceCode
                && addressStandardized == other.addressStandardized
                && administrativeDistrictCode == other.administrativeDistrictCode
                && Objects.equals(administrativeDistrictName,
                        other.administrativeDistrictName)
                && buildingNumber == other.buildingNumber
                && buildingNumberType == other.buildingNumberType
                && cityDistrictCode == other.cityDistrictCode
                && Objects.equals(cityDistrictName, other.cityDistrictName)
                && cityPartCode == other.cityPartCode
                && Objects.equals(cityPartName, other.cityPartName)
                && Objects.equals(countryCode, other.countryCode)
                && Objects.equals(countryName, other.countryName)
                && districtCode == other.districtCode
                && Objects.equals(districtName, other.districtName)
                && municipalityCode == other.municipalityCode
                && Objects.equals(municipalityName, other.municipalityName)
                && Objects.equals(orientationLetter, other.orientationLetter)
                && orientationNumber == other.orientationNumber
                && partOfMunicipalityCode == other.partOfMunicipalityCode
                && Objects.equals(partOfMunicipalityName,
                        other.partOfMunicipalityName)
                && postalCode == other.postalCode
                && Objects.equals(postalCodeText, other.postalCodeText)
                && regionCode == other.regionCode
                && Objects.equals(regionName, other.regionName)
                && streetCode == other.streetCode
                && Objects.equals(streetName, other.streetName)
                && Objects.equals(textualAddress, other.textualAddress);
    }

    @Override
    public String toString() {
        return "Address [countryCode=" + countryCode + ", countryName="
                + countryName + ", regionCode=" + regionCode + ", regionName="
                + regionName + ", districtCode=" + districtCode
                + ", districtName=" + districtName + ", municipalityCode="
                + municipalityCode + ", municipalityName=" + municipalityName
                + ", administrativeDistrictCode=" + administrativeDistrictCode
                + ", administrativeDistrictName=" + administrativeDistrictName
                + ", cityDistrictCode=" + cityDistrictCode
                + ", cityDistrictName=" + cityDistrictName + ", cityPartCode="
                + cityPartCode + ", streetCode=" + streetCode
                + ", cityPartName=" + cityPartName + ", streetName="
                + streetName + ", buildingNumber=" + buildingNumber
                + ", addressComplement=" + addressComplement
                + ", partOfMunicipalityCode=" + partOfMunicipalityCode
                + ", orientationNumber=" + orientationNumber
                + ", orientationLetter=" + orientationLetter
                + ", partOfMunicipalityName=" + partOfMunicipalityName
                + ", addressPlaceCode=" + addressPlaceCode + ", postalCode="
                + postalCode + ", textualAddress=" + textualAddress
                + ", addressNumber=" + addressNumber + ", addressStandardized="
                + addressStandardized + ", postalCodeText=" + postalCodeText
                + ", buildingNumberType=" + buildingNumberType + "]";
    }

}
