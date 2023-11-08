
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
    
    private boolean identityVerified;
    
    private boolean addressVerified;
    
    private int annualIncome;
    
    private int creditScore;
    
    private double vehicleAssessmentValue;
    
    private double disbursedAmount;
    
    private double paymentAmount;
    
    // Getters and Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public boolean isIdentityVerified() {
        return identityVerified;
    }
    
    public void setIdentityVerified(boolean identityVerified) {
        this.identityVerified = identityVerified;
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
    
    public double getVehicleAssessmentValue() {
        return vehicleAssessmentValue;
    }
    
    public void setVehicleAssessmentValue(double vehicleAssessmentValue) {
        this.vehicleAssessmentValue = vehicleAssessmentValue;
    }
    
    public double getDisbursedAmount() {
        return disbursedAmount;
    }
    
    public void setDisbursedAmount(double disbursedAmount) {
        this.disbursedAmount = disbursedAmount;
    }
    
    public double getPaymentAmount() {
        return paymentAmount;
    }
    
    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}
