package com.github.mirospanacek.ares.model.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

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
    
    public String getIco() {
        return ico;
    }
    
    public String getTradeName() {
        return tradeName;
    }
    
    public Address getAddress() {
        return address;
    }
    
    public String getLegalForm() {
        return legalForm;
    }
    
    public String getTaxOffice() {
        return taxOffice;
    }
    
    public LocalDate getEstablishmentDate() {
        return establishmentDate;
    }
    
    public LocalDate getTerminationDate() {
        return terminationDate;
    }
    
    public LocalDate getUpdateDate() {
        return updateDate;
    }
    
    public String getVatNumber() {
        return vatNumber;
    }
    
    public String getIcoId() {
        return icoId;
    }
    
    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }
    
    public RegistrationStatus getRegistrationStatus() {
        return registrationStatus;
    }
    
    public String getPrimarySource() {
        return primarySource;
    }
    
    public List<AdditionalData> getAdditionalData() {
        return additionalData;
    }
    
    public List<String> getCzNace() {
        return czNace;
    }
    
    public String getSzrSubRegister() {
        return szrSubRegister;
    }
    
    public String getEuVatId() {
        return euVatId;
    }
    
    public void setIco(String ico) {
        this.ico = ico;
    }
    
    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    
    public void setLegalForm(String legalForm) {
        this.legalForm = legalForm;
    }
    
    public void setTaxOffice(String taxOffice) {
        this.taxOffice = taxOffice;
    }
    
    public void setEstablishmentDate(LocalDate establishmentDate) {
        this.establishmentDate = establishmentDate;
    }
    
    public void setTerminationDate(LocalDate terminationDate) {
        this.terminationDate = terminationDate;
    }
    
    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }
    
    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }
    
    public void setIcoId(String icoId) {
        this.icoId = icoId;
    }
    
    public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
    
    public void setRegistrationStatus(RegistrationStatus registrationStatus) {
        this.registrationStatus = registrationStatus;
    }
    
    public void setPrimarySource(String primarySource) {
        this.primarySource = primarySource;
    }
    
    public void setAdditionalData(List<AdditionalData> additionalData) {
        this.additionalData = additionalData;
    }
    
    public void setCzNace(List<String> czNace) {
        this.czNace = czNace;
    }
    
    public void setSzrSubRegister(String szrSubRegister) {
        this.szrSubRegister = szrSubRegister;
    }
    
    public void setEuVatId(String euVatId) {
        this.euVatId = euVatId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(additionalData, address, czNace, deliveryAddress,
                establishmentDate, euVatId, ico, icoId, legalForm,
                primarySource, registrationStatus, szrSubRegister, taxOffice,
                terminationDate, tradeName, updateDate, vatNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EconomicEntity other = (EconomicEntity) obj;
        return Objects.equals(additionalData, other.additionalData)
                && Objects.equals(address, other.address)
                && Objects.equals(czNace, other.czNace)
                && Objects.equals(deliveryAddress, other.deliveryAddress)
                && Objects.equals(establishmentDate, other.establishmentDate)
                && Objects.equals(euVatId, other.euVatId)
                && Objects.equals(ico, other.ico)
                && Objects.equals(icoId, other.icoId)
                && Objects.equals(legalForm, other.legalForm)
                && Objects.equals(primarySource, other.primarySource)
                && Objects.equals(registrationStatus, other.registrationStatus)
                && Objects.equals(szrSubRegister, other.szrSubRegister)
                && Objects.equals(taxOffice, other.taxOffice)
                && Objects.equals(terminationDate, other.terminationDate)
                && Objects.equals(tradeName, other.tradeName)
                && Objects.equals(updateDate, other.updateDate)
                && Objects.equals(vatNumber, other.vatNumber);
    }

    @Override
    public String toString() {
        return "EconomicEntity [ico=" + ico + ", tradeName=" + tradeName
                + ", address=" + address + ", legalForm=" + legalForm
                + ", taxOffice=" + taxOffice + ", establishmentDate="
                + establishmentDate + ", terminationDate=" + terminationDate
                + ", updateDate=" + updateDate + ", vatNumber=" + vatNumber
                + ", icoId=" + icoId + ", deliveryAddress=" + deliveryAddress
                + ", registrationStatus=" + registrationStatus
                + ", primarySource=" + primarySource + ", additionalData="
                + additionalData + ", czNace=" + czNace + ", szrSubRegister="
                + szrSubRegister + ", euVatId=" + euVatId + "]";
    }

}
