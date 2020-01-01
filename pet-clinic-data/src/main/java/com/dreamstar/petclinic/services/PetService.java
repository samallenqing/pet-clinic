package com.dreamstar.petclinic.services;
/*

ID: PetService.java
Author: Sam

*/

import com.dreamstar.petclinic.model.Pet;
import org.springframework.stereotype.Component;

@Component
public interface PetService extends CrudService<Pet, Long> {
}
