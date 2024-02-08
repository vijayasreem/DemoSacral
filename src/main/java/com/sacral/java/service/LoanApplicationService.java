package com.sacral.java.service;

import com.sacral.java.repository.UserRepository;
import com.sacral.java.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class LoanApplicationService {

    private final UserRepository userRepository;

    @Autowired
    public LoanApplicationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void verifyDocuments() {
        System.out.println("Welcome to the Document Verification App!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your identity verification status (yes/no): ");
        String identityVerificationStatus = scanner.nextLine();

        System.out.println("Please enter your address verification status (yes/no): ");
        String addressVerificationStatus = scanner.nextLine();

        boolean identityVerified = identityVerificationStatus.equalsIgnoreCase("yes");
        boolean addressVerified = addressVerificationStatus.equalsIgnoreCase("yes");

        if (identityVerified && addressVerified) {
            System.out.println("Congratulations! You are eligible for banking services.");
        } else {
            System.out.println("Document verification is incomplete. You are not eligible for banking services.");
        }

        scanner.close();
    }

    public void evaluateCredit() {
        System.out.println("Welcome to the Credit Evaluation App!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your annual income: ");
        double annualIncome = scanner.nextDouble();

        System.out.println("Please enter your credit score: ");
        int creditScore = scanner.nextInt();

        if (annualIncome >= 30000 && creditScore >= 700) {
            System.out.println("Congratulations! You are eligible for a credit score with a high limit.");
        } else if (annualIncome >= 20000 && creditScore >= 600) {
            System.out.println("You are eligible for a credit score with a moderate limit.");
        } else {
            System.out.println("Sorry, you are not eligible for a credit score at this time.");
        }

        scanner.close();
    }

    // Add other business methods here
}