package com.kevin.sfgpetclinic.services;

import com.kevin.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
