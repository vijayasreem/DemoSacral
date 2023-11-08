package com.sacral.java.controller;

import com.sacral.java.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanApplicationController {

    private final LoanApplicationService loanApplicationService;

    @Autowired
    public LoanApplicationController(LoanApplicationService loanApplicationService) {
        this.loanApplicationService = loanApplicationService;
    }

    @GetMapping("/verifyDocuments/{identity}/{address}")
    public String verifyDocuments(@PathVariable String identity, @PathVariable String address) {
        return loanApplicationService.verifyDocuments(identity, address);
    }

    @GetMapping("/evaluateCreditworthiness/{annualIncome}/{creditScore}")
    public String evaluateCreditworthiness(@PathVariable double annualIncome, @PathVariable int creditScore) {
        return loanApplicationService.evaluateCreditworthiness(annualIncome, creditScore);
    }

    @GetMapping("/disburseLoan/{id}")
    public String disburseLoan(@PathVariable Long id) {
        return loanApplicationService.disburseLoan(id);
    }

    @GetMapping("/approvePayment/{id}")
    public String approvePayment(@PathVariable Long id) {
        return loanApplicationService.approvePayment(id);
    }

    // Add more endpoints and mappings for additional loan application methods

}