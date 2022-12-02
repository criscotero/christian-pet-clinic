package com.example.christianpetclinic.services;

import com.example.christianpetclinic.model.Owner;
import com.example.christianpetclinic.model.Pet;


import java.util.List;
import java.util.Set;


/**
 * Created by jt on 7/18/18.
 */
public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);

 }
