package com.ragnarzone.chernyshovpetclinic.services;

import com.ragnarzone.chernyshovpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
