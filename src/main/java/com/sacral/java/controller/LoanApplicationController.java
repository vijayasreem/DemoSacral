package com.sacral.java.controller;

import com.sacral.java.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loan")
public class LoanApplicationController {

    private final LoanApplicationService loanApplicationService;

    @Autowired
    public LoanApplicationController(LoanApplicationService loanApplicationService) {
        this.loanApplicationService = loanApplicationService;
    }

    @GetMapping("/document/verify/{customerId}")
    public String verifyDocument(@PathVariable Long customerId) {
        return loanApplicationService.verifyDocument(customerId);
    }

    @GetMapping("/credit/evaluate/{customerId}")
    public String evaluateCredit(@PathVariable Long customerId) {
        return loanApplicationService.evaluateCredit(customerId);
    }

    @GetMapping("/disbursement/evaluate/{customerId}")
    public String evaluateDisbursement(@PathVariable Long customerId) {
        return loanApplicationService.evaluateDisbursement(customerId);
    }

    @GetMapping("/payment/evaluate/{customerId}")
    public String evaluatePayment(@PathVariable Long customerId) {
        return loanApplicationService.evaluatePayment(customerId);
    }

    @GetMapping("/disburse/{customerId}")
    public String disburseLoan(@PathVariable Long customerId) {
        return loanApplicationService.disburseLoan(customerId);
    }
}