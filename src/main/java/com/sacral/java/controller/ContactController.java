package com.sacral.java.controller;

import com.sacral.java.model.Contact;
import com.sacral.java.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {
    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/findByEmail")
    public List<Contact> findByEmail(@RequestParam String email) {
        return contactService.findByEmail(email);
    }

    @GetMapping("/findByAlternativeContactNumber")
    public List<Contact> findByAlternativeContactNumber(@RequestParam String alternativeContactNumber) {
        return contactService.findByAlternativeContactNumber(alternativeContactNumber);
    }

    @GetMapping("/findByEmailAndAlternativeContactNumber")
    public List<Contact> findByEmailAndAlternativeContactNumber(@RequestParam String email, @RequestParam String alternativeContactNumber) {
        return contactService.findByEmailAndAlternativeContactNumber(email, alternativeContactNumber);
    }

    @GetMapping("/findByEmailOrAlternativeContactNumber")
    public List<Contact> findByEmailOrAlternativeContactNumber(@RequestParam String email, @RequestParam String alternativeContactNumber) {
        return contactService.findByEmailOrAlternativeContactNumber(email, alternativeContactNumber);
    }

    @GetMapping("/findByEmailIgnoreCase")
    public List<Contact> findByEmailIgnoreCase(@RequestParam String email) {
        return contactService.findByEmailIgnoreCase(email);
    }

    @GetMapping("/findByAlternativeEmailIgnoreCase")
    public List<Contact> findByAlternativeEmailIgnoreCase(@RequestParam String alternativeEmail) {
        return contactService.findByAlternativeEmailIgnoreCase(alternativeEmail);
    }

    @GetMapping("/findByEmailContaining")
    public List<Contact> findByEmailContaining(@RequestParam String email) {
        return contactService.findByEmailContaining(email);
    }

    @GetMapping("/findByAlternativeEmailContaining")
    public List<Contact> findByAlternativeEmailContaining(@RequestParam String alternativeEmail) {
        return contactService.findByAlternativeEmailContaining(alternativeEmail);
    }

    @GetMapping("/findByEmailStartingWith")
    public List<Contact> findByEmailStartingWith(@RequestParam String email) {
        return contactService.findByEmailStartingWith(email);
    }

    @GetMapping("/findByAlternativeEmailStartingWith")
    public List<Contact> findByAlternativeEmailStartingWith(@RequestParam String alternativeEmail) {
        return contactService.findByAlternativeEmailStartingWith(alternativeEmail);
    }

    @GetMapping("/findByEmailEndingWith")
    public List<Contact> findByEmailEndingWith(@RequestParam String email) {
        return contactService.findByEmailEndingWith(email);
    }

    @GetMapping("/findByAlternativeEmailEndingWith")
    public List<Contact> findByAlternativeEmailEndingWith(@RequestParam String alternativeEmail) {
        return contactService.findByAlternativeEmailEndingWith(alternativeEmail);
    }

    @GetMapping("/findByEmailAndLength")
    public List<Contact> findByEmailAndLength(@RequestParam String email, @RequestParam int length) {
        return contactService.findByEmailAndLength(email, length);
    }

    @GetMapping("/findByAlternativeEmailAndLength")
    public List<Contact> findByAlternativeEmailAndLength(@RequestParam String alternativeEmail, @RequestParam int length) {
        return contactService.findByAlternativeEmailAndLength(alternativeEmail, length);
    }

    @GetMapping("/findByEmailContainingIgnoreCase")
    public List<Contact> findByEmailContainingIgnoreCase(@RequestParam String searchTerm) {
        return contactService.findByEmailContainingIgnoreCase(searchTerm);
    }

    @GetMapping("/findByAlternativeEmailContainingIgnoreCase")
    public List<Contact> findByAlternativeEmailContainingIgnoreCase(@RequestParam String searchTerm) {
        return contactService.findByAlternativeEmailContainingIgnoreCase(searchTerm);
    }
}