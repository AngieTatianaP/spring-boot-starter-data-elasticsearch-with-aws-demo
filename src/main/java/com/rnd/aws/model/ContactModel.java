package com.rnd.aws.model;

import javax.persistence.*;

@Entity
@Table(name="CONTACTS")
public class ContactModel {

    @Id
    private Integer contactId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
}

