package com.ragnarzone.chernyshovpetclinic.repositories;

import com.ragnarzone.chernyshovpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
