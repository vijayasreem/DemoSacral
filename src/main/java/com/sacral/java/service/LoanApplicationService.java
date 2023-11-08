package com.sacral.java.service;

import com.sacral.java.repository.LoanApplicationRepository;
import com.sacral.java.model.LoanApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanApplicationService {

    private final LoanApplicationRepository loanApplicationRepository;

    @Autowired
    public LoanApplicationService(LoanApplicationRepository loanApplicationRepository) {
        this.loanApplicationRepository = loanApplicationRepository;
    }

    public int getNumberOfApplicationsByCustomerId(long customerId) {
        return loanApplicationRepository.getNumberOfApplicationsByCustomerId(customerId);
    }

    public int getNumberOfApprovedApplicationsByCustomerId(long customerId) {
        return loanApplicationRepository.getNumberOfApprovedApplicationsByCustomerId(customerId);
    }

    public int getNumberOfRejectedApplicationsByCustomerId(long customerId) {
        return loanApplicationRepository.getNumberOfRejectedApplicationsByCustomerId(customerId);
    }

    public int getNumberOfPendingApplicationsByCustomerId(long customerId) {
        return loanApplicationRepository.getNumberOfPendingApplicationsByCustomerId(customerId);
    }

    public List<LoanApplication> getApprovedApplicationsByCustomerId(long customerId) {
        return loanApplicationRepository.getApprovedApplicationsByCustomerId(customerId);
    }

    public List<LoanApplication> getRejectedApplicationsByCustomerId(long customerId) {
        return loanApplicationRepository.getRejectedApplicationsByCustomerId(customerId);
    }

    public List<LoanApplication> getPendingApplicationsByCustomerId(long customerId) {
        return loanApplicationRepository.getPendingApplicationsByCustomerId(customerId);
    }

    public List<LoanApplication> getEligibleApplicationsByCustomerId(long customerId) {
        return loanApplicationRepository.getEligibleApplicationsByCustomerId(customerId);
    }

    public List<LoanApplication> getHighCreditLimitApplicationsByCustomerId(long customerId) {
        return loanApplicationRepository.getHighCreditLimitApplicationsByCustomerId(customerId);
    }

    public List<LoanApplication> getModerateCreditLimitApplicationsByCustomerId(long customerId) {
        return loanApplicationRepository.getModerateCreditLimitApplicationsByCustomerId(customerId);
    }

    public List<LoanApplication> getVehicleAssessmentPassedApplicationsByCustomerId(long customerId) {
        return loanApplicationRepository.getVehicleAssessmentPassedApplicationsByCustomerId(customerId);
    }

    public List<LoanApplication> getVehicleAssessmentFailedApplicationsByCustomerId(long customerId) {
        return loanApplicationRepository.getVehicleAssessmentFailedApplicationsByCustomerId(customerId);
    }

    public List<LoanApplication> getApprovedPaymentsByCustomerId(long customerId) {
        return loanApplicationRepository.getApprovedPaymentsByCustomerId(customerId);
    }

    public List<LoanApplication> getSuccessfulDisbursementsByCustomerId(long customerId) {
        return loanApplicationRepository.getSuccessfulDisbursementsByCustomerId(customerId);
    }

    public List<LoanApplication> getInvalidVendorInfoApplicationsByCustomerId(long customerId) {
        return loanApplicationRepository.getInvalidVendorInfoApplicationsByCustomerId(customerId);
    }

    public List<LoanApplication> getInsufficientFundsApplicationsByCustomerId(long customerId) {
        return loanApplicationRepository.getInsufficientFundsApplicationsByCustomerId(customerId);
    }

    public List<LoanApplication> getPendingPaymentApprovalApplicationsByCustomerId(long customerId) {
        return loanApplicationRepository.getPendingPaymentApprovalApplicationsByCustomerId(customerId);
    }
}