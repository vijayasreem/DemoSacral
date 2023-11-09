import org.springframework.stereotype.Service;
 
import java.util.Optional;
 
import com.sacral.java.entity.LoanApplication;
import com.sacral.java.repository.LoanApplicationRepository;
 
@Service
public class LoanApplicationService {
 
    private final LoanApplicationRepository loanApplicationRepository;
 
    public LoanApplicationService(LoanApplicationRepository loanApplicationRepository) {
        this.loanApplicationRepository = loanApplicationRepository;
    }
 
    public Optional<LoanApplication> findByCustomerInfo(String customerInfo) {
        return loanApplicationRepository.findByCustomerInfo(customerInfo);
    }
 
    public Optional<LoanApplication> findByLoanDetails(String loanDetails) {
        return loanApplicationRepository.findByLoanDetails(loanDetails);
    }
 
    public Optional<LoanApplication> findByCreditHistory(String creditHistory) {
        return loanApplicationRepository.findByCreditHistory(creditHistory);
    }
 
    public Optional<LoanApplication> findByProofOfIncome(String proofOfIncome) {
        return loanApplicationRepository.findByProofOfIncome(proofOfIncome);
    }
 
    public Optional<LoanApplication> findByEmploymentDetails(String employmentDetails) {
        return loanApplicationRepository.findByEmploymentDetails(employmentDetails);
    }
 
    public Optional<LoanApplication> findByCreditCheck(String creditCheck) {
        return loanApplicationRepository.findByCreditCheck(creditCheck);
    }
 
    public Optional<LoanApplication> findByPreQualifiedAmount(String preQualifiedAmount) {
        return loanApplicationRepository.findByPreQualifiedAmount(preQualifiedAmount);
    }
 
    public Optional<LoanApplication> findByPreQualifiedInterestRate(String preQualifiedInterestRate) {
        return loanApplicationRepository.findByPreQualifiedInterestRate(preQualifiedInterestRate);
    }
 
    public Optional<LoanApplication> findByApprovedAmount(String approvedAmount) {
        return loanApplicationRepository.findByApprovedAmount(approvedAmount);
    }
 
    public Optional<LoanApplication> findByApprovedInterestRate(String approvedInterestRate) {
        return loanApplicationRepository.findByApprovedInterestRate(approvedInterestRate);
    }
 
    public Optional<LoanApplication> findByRepaymentPeriod(String repaymentPeriod) {
        return loanApplicationRepository.findByRepaymentPeriod(repaymentPeriod);
    }
 
    public Optional<LoanApplication> findByAssessmentValue(String assessmentValue) {
        return loanApplicationRepository.findByAssessmentValue(assessmentValue);
    }
 
    public Optional<LoanApplication> findByLoanOffer(String loanOffer) {
        return loanApplicationRepository.findByLoanOffer(loanOffer);
    }
 
    public Optional<LoanApplication> findByAcceptance(String acceptance) {
        return loanApplicationRepository.findByAcceptance(acceptance);
    }
 
    public Optional<LoanApplication> findByDisburseAmount(String disburseAmount) {
        return loanApplicationRepository.findByDisburseAmount(disburseAmount);
    }
 
    public LoanApplication saveApplication(LoanApplication loanApplication) {
        return loanApplicationRepository.save(loanApplication);
    }
 
    public void deleteApplication(Long id) {
        loanApplicationRepository.deleteById(id);
    }
 
}