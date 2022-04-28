package com.rnd.aws.controller;


import com.rnd.aws.model.ContactModel;
import com.rnd.aws.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ContactController {

    //@Autowired
    private ContactRepository repository;

    @GetMapping("/contacts")
    public List<ContactModel> allContacts(){
        List<ContactModel> contacts = repository.findAll();
        return contacts;
    }
}
