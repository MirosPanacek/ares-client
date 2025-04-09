package com.github.mirospanacek.ares.model.pojo;


import java.util.List;
import java.util.Objects;

public class AdditionalData {
    private List<TradeNameHistory> tradeNames;
    private List<AddressHistory> addresses;
    private String legalForm;
    private String fileMark;
    private String dataSource;
    
    public List<TradeNameHistory> getTradeNames() {
        return tradeNames;
    }
    
    public List<AddressHistory> getAddresses() {
        return addresses;
    }
    
    public String getLegalForm() {
        return legalForm;
    }
    
    public String getFileMark() {
        return fileMark;
    }
    
    public String getDataSource() {
        return dataSource;
    }
    
    public void setTradeNames(List<TradeNameHistory> tradeNames) {
        this.tradeNames = tradeNames;
    }
    
    public void setAddresses(List<AddressHistory> addresses) {
        this.addresses = addresses;
    }
    
    public void setLegalForm(String legalForm) {
        this.legalForm = legalForm;
    }
    
    public void setFileMark(String fileMark) {
        this.fileMark = fileMark;
    }
    
    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public int hashCode() {
        return Objects.hash(addresses, dataSource, fileMark, legalForm,
                tradeNames);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AdditionalData other = (AdditionalData) obj;
        return Objects.equals(addresses, other.addresses)
                && Objects.equals(dataSource, other.dataSource)
                && Objects.equals(fileMark, other.fileMark)
                && Objects.equals(legalForm, other.legalForm)
                && Objects.equals(tradeNames, other.tradeNames);
    }

    @Override
    public String toString() {
        return "AdditionalData [tradeNames=" + tradeNames + ", addresses="
                + addresses + ", legalForm=" + legalForm + ", fileMark="
                + fileMark + ", dataSource=" + dataSource + "]";
    }

}
