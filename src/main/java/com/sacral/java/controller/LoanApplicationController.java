package com.sacral.java.controller;

import com.sacral.java.service.LoanApplicationService;
import com.sacral.java.model.LoanApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loan-application")
public class LoanApplicationController {

    private final LoanApplicationService loanApplicationService;

    @Autowired
    public LoanApplicationController(LoanApplicationService loanApplicationService) {
        this.loanApplicationService = loanApplicationService;
    }

    @GetMapping("/numberOfApplications/{customerId}")
    public int getNumberOfApplicationsByCustomerId(@PathVariable long customerId) {
        return loanApplicationService.getNumberOfApplicationsByCustomerId(customerId);
    }

    @GetMapping("/numberOfApprovedApplications/{customerId}")
    public int getNumberOfApprovedApplicationsByCustomerId(@PathVariable long customerId) {
        return loanApplicationService.getNumberOfApprovedApplicationsByCustomerId(customerId);
    }

    @GetMapping("/numberOfRejectedApplications/{customerId}")
    public int getNumberOfRejectedApplicationsByCustomerId(@PathVariable long customerId) {
        return loanApplicationService.getNumberOfRejectedApplicationsByCustomerId(customerId);
    }

    @GetMapping("/numberOfPendingApplications/{customerId}")
    public int getNumberOfPendingApplicationsByCustomerId(@PathVariable long customerId) {
        return loanApplicationService.getNumberOfPendingApplicationsByCustomerId(customerId);
    }

    @GetMapping("/approvedApplications/{customerId}")
    public List<LoanApplication> getApprovedApplicationsByCustomerId(@PathVariable long customerId) {
        return loanApplicationService.getApprovedApplicationsByCustomerId(customerId);
    }

    @GetMapping("/rejectedApplications/{customerId}")
    public List<LoanApplication> getRejectedApplicationsByCustomerId(@PathVariable long customerId) {
        return loanApplicationService.getRejectedApplicationsByCustomerId(customerId);
    }

    @GetMapping("/pendingApplications/{customerId}")
    public List<LoanApplication> getPendingApplicationsByCustomerId(@PathVariable long customerId) {
        return loanApplicationService.getPendingApplicationsByCustomerId(customerId);
    }

    @GetMapping("/eligibleApplications/{customerId}")
    public List<LoanApplication> getEligibleApplicationsByCustomerId(@PathVariable long customerId) {
        return loanApplicationService.getEligibleApplicationsByCustomerId(customerId);
    }

    @GetMapping("/highCreditLimitApplications/{customerId}")
    public List<LoanApplication> getHighCreditLimitApplicationsByCustomerId(@PathVariable long customerId) {
        return loanApplicationService.getHighCreditLimitApplicationsByCustomerId(customerId);
    }

    @GetMapping("/moderateCreditLimitApplications/{customerId}")
    public List<LoanApplication> getModerateCreditLimitApplicationsByCustomerId(@PathVariable long customerId) {
        return loanApplicationService.getModerateCreditLimitApplicationsByCustomerId(customerId);
    }

    @GetMapping("/vehicleAssessmentPassedApplications/{customerId}")
    public List<LoanApplication> getVehicleAssessmentPassedApplicationsByCustomerId(@PathVariable long customerId) {
        return loanApplicationService.getVehicleAssessmentPassedApplicationsByCustomerId(customerId);
    }

    @GetMapping("/vehicleAssessmentFailedApplications/{customerId}")
    public List<LoanApplication> getVehicleAssessmentFailedApplicationsByCustomerId(@PathVariable long customerId) {
        return loanApplicationService.getVehicleAssessmentFailedApplicationsByCustomerId(customerId);
    }

    @GetMapping("/approvedPayments/{customerId}")
    public List<LoanApplication> getApprovedPaymentsByCustomerId(@PathVariable long customerId) {
        return loanApplicationService.getApprovedPaymentsByCustomerId(customerId);
    }

    @GetMapping("/successfulDisbursements/{customerId}")
    public List<LoanApplication> getSuccessfulDisbursementsByCustomerId(@PathVariable long customerId) {
        return loanApplicationService.getSuccessfulDisbursementsByCustomerId(customerId);
    }

    @GetMapping("/invalidVendorInfoApplications/{customerId}")
    public List<LoanApplication> getInvalidVendorInfoApplicationsByCustomerId(@PathVariable long customerId) {
        return loanApplicationService.getInvalidVendorInfoApplicationsByCustomerId(customerId);
    }

    @GetMapping("/insufficientFundsApplications/{customerId}")
    public List<LoanApplication> getInsufficientFundsApplicationsByCustomerId(@PathVariable long customerId) {
        return loanApplicationService.getInsufficientFundsApplicationsByCustomerId(customerId);
    }

    @GetMapping("/pendingPaymentApprovalApplications/{customerId}")
    public List<LoanApplication> getPendingPaymentApprovalApplicationsByCustomerId(@PathVariable long customerId) {
        return loanApplicationService.getPendingPaymentApprovalApplicationsByCustomerId(customerId);
    }
}