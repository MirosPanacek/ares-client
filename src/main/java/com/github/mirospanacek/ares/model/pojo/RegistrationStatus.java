package com.github.mirospanacek.ares.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public class RegistrationStatus {
    private String sourceVr;
    private String sourceRes;
    private String sourceRzp;
    private String sourceNrpzs;
    private String sourceRpsh;
    private String sourceRcns;
    private String sourceSzr;
    private String sourceDph;
    private String sourceSd;
    private String sourceIr;
    private String sourceCeu;
    private String sourceRs;
    private String sourceRed;
    private String sourceMonitor;
    
    public String getSourceVr() {
        return sourceVr;
    }
    
    public String getSourceRes() {
        return sourceRes;
    }
    
    public String getSourceRzp() {
        return sourceRzp;
    }
    
    public String getSourceNrpzs() {
        return sourceNrpzs;
    }
    
    public String getSourceRpsh() {
        return sourceRpsh;
    }
    
    public String getSourceRcns() {
        return sourceRcns;
    }
    
    public String getSourceSzr() {
        return sourceSzr;
    }
    
    public String getSourceDph() {
        return sourceDph;
    }
    
    public String getSourceSd() {
        return sourceSd;
    }
    
    public String getSourceIr() {
        return sourceIr;
    }
    
    public String getSourceCeu() {
        return sourceCeu;
    }
    
    public String getSourceRs() {
        return sourceRs;
    }
    
    public String getSourceRed() {
        return sourceRed;
    }
    
    public String getSourceMonitor() {
        return sourceMonitor;
    }
    
    public void setSourceVr(String sourceVr) {
        this.sourceVr = sourceVr;
    }
    
    public void setSourceRes(String sourceRes) {
        this.sourceRes = sourceRes;
    }
    
    public void setSourceRzp(String sourceRzp) {
        this.sourceRzp = sourceRzp;
    }
    
    public void setSourceNrpzs(String sourceNrpzs) {
        this.sourceNrpzs = sourceNrpzs;
    }
    
    public void setSourceRpsh(String sourceRpsh) {
        this.sourceRpsh = sourceRpsh;
    }
    
    public void setSourceRcns(String sourceRcns) {
        this.sourceRcns = sourceRcns;
    }
    
    public void setSourceSzr(String sourceSzr) {
        this.sourceSzr = sourceSzr;
    }
    
    public void setSourceDph(String sourceDph) {
        this.sourceDph = sourceDph;
    }
    
    public void setSourceSd(String sourceSd) {
        this.sourceSd = sourceSd;
    }
    
    public void setSourceIr(String sourceIr) {
        this.sourceIr = sourceIr;
    }
    
    public void setSourceCeu(String sourceCeu) {
        this.sourceCeu = sourceCeu;
    }
    
    public void setSourceRs(String sourceRs) {
        this.sourceRs = sourceRs;
    }
    
    public void setSourceRed(String sourceRed) {
        this.sourceRed = sourceRed;
    }
    
    public void setSourceMonitor(String sourceMonitor) {
        this.sourceMonitor = sourceMonitor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceCeu, sourceDph, sourceIr, sourceMonitor,
                sourceNrpzs, sourceRcns, sourceRed, sourceRes, sourceRpsh,
                sourceRs, sourceRzp, sourceSd, sourceSzr, sourceVr);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RegistrationStatus other = (RegistrationStatus) obj;
        return Objects.equals(sourceCeu, other.sourceCeu)
                && Objects.equals(sourceDph, other.sourceDph)
                && Objects.equals(sourceIr, other.sourceIr)
                && Objects.equals(sourceMonitor, other.sourceMonitor)
                && Objects.equals(sourceNrpzs, other.sourceNrpzs)
                && Objects.equals(sourceRcns, other.sourceRcns)
                && Objects.equals(sourceRed, other.sourceRed)
                && Objects.equals(sourceRes, other.sourceRes)
                && Objects.equals(sourceRpsh, other.sourceRpsh)
                && Objects.equals(sourceRs, other.sourceRs)
                && Objects.equals(sourceRzp, other.sourceRzp)
                && Objects.equals(sourceSd, other.sourceSd)
                && Objects.equals(sourceSzr, other.sourceSzr)
                && Objects.equals(sourceVr, other.sourceVr);
    }

    @Override
    public String toString() {
        return "RegistrationStatus [sourceVr=" + sourceVr + ", sourceRes="
                + sourceRes + ", sourceRzp=" + sourceRzp + ", sourceNrpzs="
                + sourceNrpzs + ", sourceRpsh=" + sourceRpsh + ", sourceRcns="
                + sourceRcns + ", sourceSzr=" + sourceSzr + ", sourceDph="
                + sourceDph + ", sourceSd=" + sourceSd + ", sourceIr="
                + sourceIr + ", sourceCeu=" + sourceCeu + ", sourceRs="
                + sourceRs + ", sourceRed=" + sourceRed + ", sourceMonitor="
                + sourceMonitor + "]";
    }

}
