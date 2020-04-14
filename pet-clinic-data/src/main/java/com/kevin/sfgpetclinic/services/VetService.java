package com.kevin.sfgpetclinic.services;

import com.kevin.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findbyId(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
