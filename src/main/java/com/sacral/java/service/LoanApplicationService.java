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

    public String verifyDocuments(String identity, String address) {
        String greetingMessage = "Welcome to the Document Verification App!";
        
        boolean identityVerified = verifyIdentity(identity);
        boolean addressVerified = verifyAddress(address);
        
        if (identityVerified && addressVerified) {
            return greetingMessage + "\nCongratulations! You are eligible for banking services.";
        } else {
            return greetingMessage + "\nDocument verification is incomplete. You are not eligible for banking services.";
        }
    }
    
    private boolean verifyIdentity(String identity) {
        // Implement logic to verify identity using provided input
        // Return true if identity is verified, false otherwise
    }
    
    private boolean verifyAddress(String address) {
        // Implement logic to verify address using provided input
        // Return true if address is verified, false otherwise
    }
    
    public String evaluateCreditworthiness(double annualIncome, int creditScore) {
        String message = "";
        
        if (annualIncome >= 30000 && creditScore >= 700) {
            message = "Congratulations! You are eligible for a credit score with a high limit.";
        } else if (annualIncome >= 20000 && creditScore >= 600) {
            message = "You are eligible for a credit score with a moderate limit.";
        }
        
        return message;
    }
    
    public String disburseLoan(Long id) {
        double vehicleAssessmentValue = loanApplicationRepository.getVehicleAssessmentValueById(id);
        double disbursedAmount = loanApplicationRepository.getDisbursedAmountById(id);
        
        if (disbursedAmount <= vehicleAssessmentValue) {
            return "Vehicle assessment passed.\nDisbursed Amount: $" + disbursedAmount;
        } else {
            return "Vehicle assessment failed.\nLoan amount cannot exceed vehicle value.";
        }
    }
    
    public String approvePayment(Long id) {
        double paymentAmount = loanApplicationRepository.getPaymentAmountById(id);
        
        if (paymentAmount <= 1000.0) {
            return "Payment approved.";
        } else {
            return "Payment not approved. Please review payment amount.";
        }
    }
    
    // Add more methods and logic as needed for the loan application process

}