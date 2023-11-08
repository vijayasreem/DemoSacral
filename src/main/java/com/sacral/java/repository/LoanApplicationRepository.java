
package com.sacral.java.repository;

import com.sacral.java.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {

    @Query("SELECT COUNT(l) > 0 FROM LoanApplication l WHERE l.identityVerified = true AND l.addressVerified = true")
    boolean isEligibleForBankingServices();

    @Query("SELECT COUNT(l) > 0 FROM LoanApplication l WHERE l.annualIncome >= 30000 AND l.creditScore >= 700")
    boolean isEligibleForHighLimitCreditScore();

    @Query("SELECT COUNT(l) > 0 FROM LoanApplication l WHERE l.annualIncome >= 20000 AND l.creditScore >= 600")
    boolean isEligibleForModerateLimitCreditScore();

    @Query("SELECT l.vehicleAssessmentValue FROM LoanApplication l WHERE l.id = :id")
    double getVehicleAssessmentValueById(Long id);

    @Query("SELECT l.disbursedAmount <= l.vehicleAssessmentValue FROM LoanApplication l WHERE l.id = :id")
    boolean isVehicleAssessmentPassed(Long id);

    @Query("SELECT l.disbursedAmount FROM LoanApplication l WHERE l.id = :id")
    double getDisbursedAmountById(Long id);

    @Query("SELECT l.paymentAmount <= 1000.0 FROM LoanApplication l WHERE l.id = :id")
    boolean isPaymentApproved(Long id);

    // Add more methods and queries as needed for the loan application process

}
