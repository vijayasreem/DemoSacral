package com.sacral.java.controller;

import com.sacral.java.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class LoanApplicationController {

    private final LoanApplicationService loanApplicationService;

    @Autowired
    public LoanApplicationController(LoanApplicationService loanApplicationService) {
        this.loanApplicationService = loanApplicationService;
    }

    @GetMapping("/verifyDocuments")
    public String verifyDocuments() {
        loanApplicationService.verifyDocuments();
        return "Document verification completed.";
    }

    @GetMapping("/evaluateCredit")
    public String evaluateCredit() {
        loanApplicationService.evaluateCredit();
        return "Credit evaluation completed.";
    }

    // Add other business methods here
}