package com.dreamstar.petclinic.repository;
/*

ID: PetRepository.java
Author: Sam

*/

import com.dreamstar.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
