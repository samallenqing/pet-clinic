package com.dreamstar.petclinic.repository;
/*

ID: OwnerRepository.java
Author: Sam

*/

import com.dreamstar.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;


public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findOwnerByLastName(String lastName);

    Owner findOwnerById(Long id);
}
