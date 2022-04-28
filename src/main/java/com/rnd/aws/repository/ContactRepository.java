package com.rnd.aws.repository;

import com.rnd.aws.model.ContactModel;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface ContactRepository extends JpaRepository<ContactModel,String> {

    //List<ContactModel> allContacts();
}
