
package com.sacral.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "identity_verified")
    private boolean identityVerified;

    @Column(name = "address_verified")
    private boolean addressVerified;

    @Column(name = "annual_income")
    private double annualIncome;

    @Column(name = "credit_score")
    private int creditScore;

    // Getters and Setters
    // ...

    // Other methods
    // ...
}
