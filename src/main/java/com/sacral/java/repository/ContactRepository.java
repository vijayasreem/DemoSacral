
package com.sacral.java.repository;

import com.sacral.java.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

    // Custom query to find contacts by email
    List<Contact> findByEmail(String email);

    // Custom query to find contacts by alternative contact number
    List<Contact> findByAlternativeContactNumber(String alternativeContactNumber);

    // Custom query to find contacts by email and alternative contact number
    List<Contact> findByEmailAndAlternativeContactNumber(String email, String alternativeContactNumber);

    // Custom query to find contacts by email or alternative contact number
    List<Contact> findByEmailOrAlternativeContactNumber(String email, String alternativeContactNumber);

    // Custom query to find contacts by email ignoring case
    List<Contact> findByEmailIgnoreCase(String email);

    // Custom query to find contacts by alternative email ignoring case
    List<Contact> findByAlternativeEmailIgnoreCase(String alternativeEmail);

    // Custom query to find contacts by email containing a specific string
    List<Contact> findByEmailContaining(String email);

    // Custom query to find contacts by alternative email containing a specific string
    List<Contact> findByAlternativeEmailContaining(String alternativeEmail);

    // Custom query to find contacts by email starting with a specific string
    List<Contact> findByEmailStartingWith(String email);

    // Custom query to find contacts by alternative email starting with a specific string
    List<Contact> findByAlternativeEmailStartingWith(String alternativeEmail);

    // Custom query to find contacts by email ending with a specific string
    List<Contact> findByEmailEndingWith(String email);

    // Custom query to find contacts by alternative email ending with a specific string
    List<Contact> findByAlternativeEmailEndingWith(String alternativeEmail);

    // Custom query to find contacts by email with a specific length
    List<Contact> findByEmailAndLength(String email, int length);

    // Custom query to find contacts by alternative email with a specific length
    List<Contact> findByAlternativeEmailAndLength(String alternativeEmail, int length);

    // Custom query to find contacts by email containing a specific string and ignoring case
    @Query("SELECT c FROM Contact c WHERE LOWER(c.email) LIKE LOWER(concat('%', :searchTerm, '%'))")
    List<Contact> findByEmailContainingIgnoreCase(String searchTerm);

    // Custom query to find contacts by alternative email containing a specific string and ignoring case
    @Query("SELECT c FROM Contact c WHERE LOWER(c.alternativeEmail) LIKE LOWER(concat('%', :searchTerm, '%'))")
    List<Contact> findByAlternativeEmailContainingIgnoreCase(String searchTerm);
}
