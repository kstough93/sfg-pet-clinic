package com.kevin.sfgpetclinic.repositories;

import com.kevin.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
