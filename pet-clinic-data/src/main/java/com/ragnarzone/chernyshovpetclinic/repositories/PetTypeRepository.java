package com.ragnarzone.chernyshovpetclinic.repositories;

import com.ragnarzone.chernyshovpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
