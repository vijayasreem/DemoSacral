package com.sacral.java.service;

import com.sacral.java.model.Contact;
import com.sacral.java.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    private final ContactRepository contactRepository;

    @Autowired
    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public List<Contact> findByEmail(String email) {
        return contactRepository.findByEmail(email);
    }

    public List<Contact> findByAlternativeContactNumber(String alternativeContactNumber) {
        return contactRepository.findByAlternativeContactNumber(alternativeContactNumber);
    }

    public List<Contact> findByEmailAndAlternativeContactNumber(String email, String alternativeContactNumber) {
        return contactRepository.findByEmailAndAlternativeContactNumber(email, alternativeContactNumber);
    }

    public List<Contact> findByEmailOrAlternativeContactNumber(String email, String alternativeContactNumber) {
        return contactRepository.findByEmailOrAlternativeContactNumber(email, alternativeContactNumber);
    }

    public List<Contact> findByEmailIgnoreCase(String email) {
        return contactRepository.findByEmailIgnoreCase(email);
    }

    public List<Contact> findByAlternativeEmailIgnoreCase(String alternativeEmail) {
        return contactRepository.findByAlternativeEmailIgnoreCase(alternativeEmail);
    }

    public List<Contact> findByEmailContaining(String email) {
        return contactRepository.findByEmailContaining(email);
    }

    public List<Contact> findByAlternativeEmailContaining(String alternativeEmail) {
        return contactRepository.findByAlternativeEmailContaining(alternativeEmail);
    }

    public List<Contact> findByEmailStartingWith(String email) {
        return contactRepository.findByEmailStartingWith(email);
    }

    public List<Contact> findByAlternativeEmailStartingWith(String alternativeEmail) {
        return contactRepository.findByAlternativeEmailStartingWith(alternativeEmail);
    }

    public List<Contact> findByEmailEndingWith(String email) {
        return contactRepository.findByEmailEndingWith(email);
    }

    public List<Contact> findByAlternativeEmailEndingWith(String alternativeEmail) {
        return contactRepository.findByAlternativeEmailEndingWith(alternativeEmail);
    }

    public List<Contact> findByEmailAndLength(String email, int length) {
        return contactRepository.findByEmailAndLength(email, length);
    }

    public List<Contact> findByAlternativeEmailAndLength(String alternativeEmail, int length) {
        return contactRepository.findByAlternativeEmailAndLength(alternativeEmail, length);
    }

    public List<Contact> findByEmailContainingIgnoreCase(String searchTerm) {
        return contactRepository.findByEmailContainingIgnoreCase(searchTerm);
    }

    public List<Contact> findByAlternativeEmailContainingIgnoreCase(String searchTerm) {
        return contactRepository.findByAlternativeEmailContainingIgnoreCase(searchTerm);
    }
}

// Please note that the ContactService class assumes that the ContactRepository class already exists in the specified package.