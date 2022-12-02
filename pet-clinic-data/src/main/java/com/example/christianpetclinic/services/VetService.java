package com.example.christianpetclinic.services;

import com.example.christianpetclinic.model.Vet;


import java.util.Set;


/**
 * Created by jt on 7/18/18.
 */
public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();


}
