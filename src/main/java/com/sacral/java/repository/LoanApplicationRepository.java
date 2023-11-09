import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sacral.java.entity.LoanApplication;

public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {
 
    @Query("SELECT l FROM LoanApplication l WHERE l.customerInfo = ?1")
    LoanApplication findByCustomerInfo(String customerInfo);

    @Query("SELECT l FROM LoanApplication l WHERE l.loanDetails = ?1")
    LoanApplication findByLoanDetails(String loanDetails);

    @Query("SELECT l FROM LoanApplication l WHERE l.creditHistory = ?1")
    LoanApplication findByCreditHistory(String creditHistory);

    @Query("SELECT l FROM LoanApplication l WHERE l.proofOfIncome = ?1")
    LoanApplication findByProofOfIncome(String proofOfIncome);

    @Query("SELECT l FROM LoanApplication l WHERE l.employmentDetails = ?1")
    LoanApplication findByEmploymentDetails(String employmentDetails);

    @Query("SELECT l FROM LoanApplication l WHERE l.creditCheck = ?1")
    LoanApplication findByCreditCheck(String creditCheck);

    @Query("SELECT l FROM LoanApplication l WHERE l.preQualifiedAmount = ?1")
    LoanApplication findByPreQualifiedAmount(String preQualifiedAmount);

    @Query("SELECT l FROM LoanApplication l WHERE l.preQualifiedInterestRate = ?1")
    LoanApplication findByPreQualifiedInterestRate(String preQualifiedInterestRate);

    @Query("SELECT l FROM LoanApplication l WHERE l.approvedAmount = ?1")
    LoanApplication findByApprovedAmount(String approvedAmount);

    @Query("SELECT l FROM LoanApplication l WHERE l.approvedInterestRate = ?1")
    LoanApplication findByApprovedInterestRate(String approvedInterestRate);

    @Query("SELECT l FROM LoanApplication l WHERE l.repaymentPeriod = ?1")
    LoanApplication findByRepaymentPeriod(String repaymentPeriod);

    @Query("SELECT l FROM LoanApplication l WHERE l.assessmentValue = ?1")
    LoanApplication findByAssessmentValue(String assessmentValue);

    @Query("SELECT l FROM LoanApplication l WHERE l.loanOffer = ?1")
    LoanApplication findByLoanOffer(String loanOffer);

    @Query("SELECT l FROM LoanApplication l WHERE l.acceptance = ?1")
    LoanApplication findByAcceptance(String acceptance);

    @Query("SELECT l FROM LoanApplication l WHERE l.disburseAmount = ?1")
    LoanApplication findByDisburseAmount(String disburseAmount);
}