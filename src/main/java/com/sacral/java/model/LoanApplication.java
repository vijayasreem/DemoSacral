package com.sacral.java.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoanApplication {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private long customerId;
    private String status;
    private boolean documentVerified;
    private boolean addressVerified;
    private int annualIncome;
    private int creditScore;
    private double disbursedAmount;
    private double vehicleAssessmentValue;
    private double paymentAmount;
    private boolean vendorInfoVerified;
    private boolean fundsAvailable;
    private boolean paymentApproval;
    
    // Getters and Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public long getCustomerId() {
        return customerId;
    }
    
    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public boolean isDocumentVerified() {
        return documentVerified;
    }
    
    public void setDocumentVerified(boolean documentVerified) {
        this.documentVerified = documentVerified;
    }
    
    public boolean isAddressVerified() {
        return addressVerified;
    }
    
    public void setAddressVerified(boolean addressVerified) {
        this.addressVerified = addressVerified;
    }
    
    public int getAnnualIncome() {
        return annualIncome;
    }
    
    public void setAnnualIncome(int annualIncome) {
        this.annualIncome = annualIncome;
    }
    
    public int getCreditScore() {
        return creditScore;
    }
    
    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }
    
    public double getDisbursedAmount() {
        return disbursedAmount;
    }
    
    public void setDisbursedAmount(double disbursedAmount) {
        this.disbursedAmount = disbursedAmount;
    }
    
    public double getVehicleAssessmentValue() {
        return vehicleAssessmentValue;
    }
    
    public void setVehicleAssessmentValue(double vehicleAssessmentValue) {
        this.vehicleAssessmentValue = vehicleAssessmentValue;
    }
    
    public double getPaymentAmount() {
        return paymentAmount;
    }
    
    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
    
    public boolean isVendorInfoVerified() {
        return vendorInfoVerified;
    }
    
    public void setVendorInfoVerified(boolean vendorInfoVerified) {
        this.vendorInfoVerified = vendorInfoVerified;
    }
    
    public boolean isFundsAvailable() {
        return fundsAvailable;
    }
    
    public void setFundsAvailable(boolean fundsAvailable) {
        this.fundsAvailable = fundsAvailable;
    }
    
    public boolean isPaymentApproval() {
        return paymentApproval;
    }
    
    public void setPaymentApproval(boolean paymentApproval) {
        this.paymentApproval = paymentApproval;
    }
}