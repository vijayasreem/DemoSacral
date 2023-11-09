package com.sacral.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.java.entity.LoanApplication;
import com.sacral.java.service.LoanApplicationService;

@RestController
@RequestMapping("/loan-applications")
public class LoanApplicationController {
	
	@Autowired
	LoanApplicationService loanApplicationService;
	
	@PostMapping
	public ResponseEntity<LoanApplication> createLoanApplication(@RequestBody LoanApplication loanApplication) {
		LoanApplication savedLoanApplication = loanApplicationService.saveApplication(loanApplication);
		return new ResponseEntity<>(savedLoanApplication, HttpStatus.CREATED);
	}
}