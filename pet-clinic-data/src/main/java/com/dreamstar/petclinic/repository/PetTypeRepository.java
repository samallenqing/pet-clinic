package com.dreamstar.petclinic.repository;
/*

ID: PetTypeRepository.java
Author: Sam

*/

import com.dreamstar.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
