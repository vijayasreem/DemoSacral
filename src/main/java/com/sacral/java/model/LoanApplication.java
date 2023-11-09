package com.sacral.java.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoanApplication {

    @Id
    private Long id;
    private String customerInfo;
    private String loanDetails;
    private String creditHistory;
    private String proofOfIncome;
    private String employmentDetails;
    private String creditCheck;
    private String preQualifiedAmount;
    private String preQualifiedInterestRate;
    private String approvedAmount;
    private String approvedInterestRate;
    private String repaymentPeriod;
    private String assessmentValue;
    private String loanOffer;
    private String acceptance;
    private String disburseAmount;

    public LoanApplication() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(String customerInfo) {
        this.customerInfo = customerInfo;
    }

    public String getLoanDetails() {
        return loanDetails;
    }

    public void setLoanDetails(String loanDetails) {
        this.loanDetails = loanDetails;
    }

    public String getCreditHistory() {
        return creditHistory;
    }

    public void setCreditHistory(String creditHistory) {
        this.creditHistory = creditHistory;
    }

    public String getProofOfIncome() {
        return proofOfIncome;
    }

    public void setProofOfIncome(String proofOfIncome) {
        this.proofOfIncome = proofOfIncome;
    }

    public String getEmploymentDetails() {
        return employmentDetails;
    }

    public void setEmploymentDetails(String employmentDetails) {
        this.employmentDetails = employmentDetails;
    }

    public String getCreditCheck() {
        return creditCheck;
    }

    public void setCreditCheck(String creditCheck) {
        this.creditCheck = creditCheck;
    }

    public String getPreQualifiedAmount() {
        return preQualifiedAmount;
    }

    public void setPreQualifiedAmount(String preQualifiedAmount) {
        this.preQualifiedAmount = preQualifiedAmount;
    }

    public String getPreQualifiedInterestRate() {
        return preQualifiedInterestRate;
    }

    public void setPreQualifiedInterestRate(String preQualifiedInterestRate) {
        this.preQualifiedInterestRate = preQualifiedInterestRate;
    }

    public String getApprovedAmount() {
        return approvedAmount;
    }

    public void setApprovedAmount(String approvedAmount) {
        this.approvedAmount = approvedAmount;
    }

    public String getApprovedInterestRate() {
        return approvedInterestRate;
    }

    public void setApprovedInterestRate(String approvedInterestRate) {
        this.approvedInterestRate = approvedInterestRate;
    }

    public String getRepaymentPeriod() {
        return repaymentPeriod;
    }

    public void setRepaymentPeriod(String repaymentPeriod) {
        this.repaymentPeriod = repaymentPeriod;
    }

    public String getAssessmentValue() {
        return assessmentValue;
    }

    public void setAssessmentValue(String assessmentValue) {
        this.assessmentValue = assessmentValue;
    }

    public String getLoanOffer() {
        return loanOffer;
    }

    public void setLoanOffer(String loanOffer) {
        this.loanOffer = loanOffer;
    }

    public String getAcceptance() {
        return acceptance;
    }

    public void setAcceptance(String acceptance) {
        this.acceptance = acceptance;
    }

    public String getDisburseAmount() {
        return disburseAmount;
    }

    public void setDisburseAmount(String disburseAmount) {
        this.disburseAmount = disburseAmount;
    }

}