package com.sacral.java.service;

import com.sacral.java.repository.LoanApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanApplicationService {

    private final LoanApplicationRepository loanApplicationRepository;

    @Autowired
    public LoanApplicationService(LoanApplicationRepository loanApplicationRepository) {
        this.loanApplicationRepository = loanApplicationRepository;
    }

    public String verifyDocument(Long customerId) {
        if (loanApplicationRepository.isDocumentVerified(customerId)) {
            return "Document verification successful. Eligible for banking services.";
        } else {
            return "Document verification incomplete. Not eligible for banking services.";
        }
    }

    public String evaluateCredit(Long customerId) {
        if (loanApplicationRepository.isEligibleForHighCreditLimit(customerId)) {
            return "Congratulations! You are eligible for a credit score with a high limit.";
        } else if (loanApplicationRepository.isEligibleForModerateCreditLimit(customerId)) {
            return "You are eligible for a credit score with a moderate limit.";
        } else {
            return "Sorry, you are not eligible for a credit score.";
        }
    }

    public String evaluateDisbursement(Long customerId) {
        if (loanApplicationRepository.isVehicleAssessmentPassed(customerId)) {
            double disbursedAmount = loanApplicationRepository.getDisbursedAmount(customerId);
            return "Vehicle assessment passed. Disbursed Amount: $" + disbursedAmount;
        } else {
            return "Vehicle assessment failed. Loan amount cannot exceed vehicle value.";
        }
    }

    public String evaluatePayment(Long customerId) {
        if (loanApplicationRepository.isPaymentApproved(customerId)) {
            return "Payment approved.";
        } else {
            return "Payment approval required.";
        }
    }

    public String disburseLoan(Long customerId) {
        if (loanApplicationRepository.isVendorInfoVerified(customerId) && loanApplicationRepository.isFundsAvailable(customerId) && loanApplicationRepository.isPaymentApproved(customerId)) {
            double disbursedAmount = loanApplicationRepository.getDisbursedAmount(customerId);
            return "Disbursement successful. Vendor: " + getVendorName(customerId) + ", Payment Amount: $" + disbursedAmount;
        } else if (!loanApplicationRepository.isVendorInfoVerified(customerId)) {
            return "Invalid vendor information.";
        } else if (!loanApplicationRepository.isFundsAvailable(customerId)) {
            return "Insufficient funds for disbursement.";
        } else if (!loanApplicationRepository.isPaymentApproved(customerId)) {
            return "Payment approval required.";
        } else {
            return "Disbursement failed.";
        }
    }

    private String getVendorName(Long customerId) {
        // Get vendor name from external system based on customerId
        return "Vendor Name";
    }
}