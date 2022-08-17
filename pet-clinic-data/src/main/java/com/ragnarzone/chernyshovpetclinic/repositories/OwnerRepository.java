package com.ragnarzone.chernyshovpetclinic.repositories;

import com.ragnarzone.chernyshovpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
