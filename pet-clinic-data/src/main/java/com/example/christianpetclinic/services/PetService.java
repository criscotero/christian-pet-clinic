package com.example.christianpetclinic.services;

import com.example.christianpetclinic.model.Pet;

import java.util.Set;


/**
 * Created by jt on 7/18/18.
 */
public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
