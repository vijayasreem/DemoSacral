
package com.sacral.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.sacral.java.model.LoanApplication;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {

    @Query("SELECT COUNT(l) FROM LoanApplication l WHERE l.customerId = ?1")
    int getNumberOfApplicationsByCustomerId(long customerId);

    @Query("SELECT COUNT(l) FROM LoanApplication l WHERE l.customerId = ?1 AND l.status = 'APPROVED'")
    int getNumberOfApprovedApplicationsByCustomerId(long customerId);

    @Query("SELECT COUNT(l) FROM LoanApplication l WHERE l.customerId = ?1 AND l.status = 'REJECTED'")
    int getNumberOfRejectedApplicationsByCustomerId(long customerId);

    @Query("SELECT COUNT(l) FROM LoanApplication l WHERE l.customerId = ?1 AND l.status = 'PENDING'")
    int getNumberOfPendingApplicationsByCustomerId(long customerId);

    @Query("SELECT l FROM LoanApplication l WHERE l.customerId = ?1 AND l.status = 'APPROVED'")
    List<LoanApplication> getApprovedApplicationsByCustomerId(long customerId);

    @Query("SELECT l FROM LoanApplication l WHERE l.customerId = ?1 AND l.status = 'REJECTED'")
    List<LoanApplication> getRejectedApplicationsByCustomerId(long customerId);

    @Query("SELECT l FROM LoanApplication l WHERE l.customerId = ?1 AND l.status = 'PENDING'")
    List<LoanApplication> getPendingApplicationsByCustomerId(long customerId);

    @Query("SELECT l FROM LoanApplication l WHERE l.customerId = ?1 AND l.documentVerified = true AND l.addressVerified = true")
    List<LoanApplication> getEligibleApplicationsByCustomerId(long customerId);

    @Query("SELECT l FROM LoanApplication l WHERE l.customerId = ?1 AND l.annualIncome >= 30000 AND l.creditScore >= 700")
    List<LoanApplication> getHighCreditLimitApplicationsByCustomerId(long customerId);

    @Query("SELECT l FROM LoanApplication l WHERE l.customerId = ?1 AND l.annualIncome >= 20000 AND l.creditScore >= 600")
    List<LoanApplication> getModerateCreditLimitApplicationsByCustomerId(long customerId);

    @Query("SELECT l FROM LoanApplication l WHERE l.customerId = ?1 AND l.disbursedAmount <= l.vehicleAssessmentValue")
    List<LoanApplication> getVehicleAssessmentPassedApplicationsByCustomerId(long customerId);

    @Query("SELECT l FROM LoanApplication l WHERE l.customerId = ?1 AND l.disbursedAmount > l.vehicleAssessmentValue")
    List<LoanApplication> getVehicleAssessmentFailedApplicationsByCustomerId(long customerId);

    @Query("SELECT l FROM LoanApplication l WHERE l.customerId = ?1 AND l.paymentAmount <= 1000.0")
    List<LoanApplication> getApprovedPaymentsByCustomerId(long customerId);

    @Query("SELECT l FROM LoanApplication l WHERE l.customerId = ?1 AND l.vendorInfoVerified = true AND l.fundsAvailable = true AND l.paymentApproval = true")
    List<LoanApplication> getSuccessfulDisbursementsByCustomerId(long customerId);

    @Query("SELECT l FROM LoanApplication l WHERE l.customerId = ?1 AND l.vendorInfoVerified = false")
    List<LoanApplication> getInvalidVendorInfoApplicationsByCustomerId(long customerId);

    @Query("SELECT l FROM LoanApplication l WHERE l.customerId = ?1 AND l.fundsAvailable = false")
    List<LoanApplication> getInsufficientFundsApplicationsByCustomerId(long customerId);

    @Query("SELECT l FROM LoanApplication l WHERE l.customerId = ?1 AND l.paymentApproval = false")
    List<LoanApplication> getPendingPaymentApprovalApplicationsByCustomerId(long customerId);
}
