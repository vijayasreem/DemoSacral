package com.sacral.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loan_application")
public class LoanApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "document_verified")
    private boolean documentVerified;

    @Column(name = "income")
    private double income;

    @Column(name = "credit_score")
    private double creditScore;

    @Column(name = "vehicle_assessment_value")
    private double vehicleAssessmentValue;

    @Column(name = "disbursed_amount")
    private double disbursedAmount;

    @Column(name = "payment_amount")
    private double paymentAmount;

    @Column(name = "vendor_verified")
    private boolean vendorVerified;

    @Column(name = "funds_available")
    private double fundsAvailable;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public boolean isDocumentVerified() {
        return documentVerified;
    }

    public void setDocumentVerified(boolean documentVerified) {
        this.documentVerified = documentVerified;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(double creditScore) {
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

    public boolean isVendorVerified() {
        return vendorVerified;
    }

    public void setVendorVerified(boolean vendorVerified) {
        this.vendorVerified = vendorVerified;
    }

    public double getFundsAvailable() {
        return fundsAvailable;
    }

    public void setFundsAvailable(double fundsAvailable) {
        this.fundsAvailable = fundsAvailable;
    }
}