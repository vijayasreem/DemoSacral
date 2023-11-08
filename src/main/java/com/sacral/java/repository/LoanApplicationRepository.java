
package com.sacral.java.repository;

import com.sacral.java.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {

    @Query("SELECT CASE WHEN COUNT(l) > 0 THEN true ELSE false END FROM LoanApplication l WHERE l.customerId = :customerId AND l.documentVerified = true")
    boolean isDocumentVerified(Long customerId);

    @Query("SELECT CASE WHEN COUNT(l) > 0 THEN true ELSE false END FROM LoanApplication l WHERE l.customerId = :customerId AND l.income >= 30000 AND l.creditScore >= 700")
    boolean isEligibleForHighCreditLimit(Long customerId);

    @Query("SELECT CASE WHEN COUNT(l) > 0 THEN true ELSE false END FROM LoanApplication l WHERE l.customerId = :customerId AND l.income >= 20000 AND l.creditScore >= 600")
    boolean isEligibleForModerateCreditLimit(Long customerId);

    @Query("SELECT l.vehicleAssessmentValue FROM LoanApplication l WHERE l.customerId = :customerId")
    double getVehicleAssessmentValue(Long customerId);

    @Query("SELECT CASE WHEN l.disbursedAmount <= l.vehicleAssessmentValue THEN true ELSE false END FROM LoanApplication l WHERE l.customerId = :customerId")
    boolean isVehicleAssessmentPassed(Long customerId);

    @Query("SELECT l.disbursedAmount FROM LoanApplication l WHERE l.customerId = :customerId")
    double getDisbursedAmount(Long customerId);

    @Query("SELECT CASE WHEN l.disbursedAmount <= l.vehicleAssessmentValue THEN 'Vehicle assessment passed. Disbursed Amount: $' || l.disbursedAmount ELSE 'Vehicle assessment failed. Loan amount cannot exceed vehicle value.' END FROM LoanApplication l WHERE l.customerId = :customerId")
    String getDisbursementStatus(Long customerId);

    @Query("SELECT CASE WHEN l.paymentAmount <= 1000.0 THEN true ELSE false END FROM LoanApplication l WHERE l.customerId = :customerId")
    boolean isPaymentApproved(Long customerId);

    @Query("SELECT CASE WHEN COUNT(l) > 0 THEN true ELSE false END FROM LoanApplication l WHERE l.customerId = :customerId AND l.vendorVerified = true")
    boolean isVendorInfoVerified(Long customerId);

    @Query("SELECT CASE WHEN l.fundsAvailable >= l.paymentAmount THEN true ELSE false END FROM LoanApplication l WHERE l.customerId = :customerId")
    boolean isFundsAvailable(Long customerId);
}
