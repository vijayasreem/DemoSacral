
package com.sacral.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sacral.java.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.identityVerified = true AND u.addressVerified = true")
    User findUserByVerifiedIdentityAndAddress();

    @Query("SELECT u FROM User u WHERE u.annualIncome >= 30000 AND u.creditScore >= 700")
    User findUserByHighCreditEligibility();

    @Query("SELECT u FROM User u WHERE u.annualIncome >= 20000 AND u.creditScore >= 600")
    User findUserByModerateCreditEligibility();
}
