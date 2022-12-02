package com.example.christianpetclinic.services;

import com.example.christianpetclinic.model.Owner;
import com.example.christianpetclinic.model.Pet;


import java.util.List;
import java.util.Set;


/**
 * Created by jt on 7/18/18.
 */
public interface OwnerService {

    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);

    Set<Owner> findAll();
 }
