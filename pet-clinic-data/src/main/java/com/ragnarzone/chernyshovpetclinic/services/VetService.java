package com.ragnarzone.chernyshovpetclinic.services;

import com.ragnarzone.chernyshovpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet Vet);

    Set<Vet> findAll();
}
