package com.dreamstar.petclinic.repository;
/*

ID: VetRepository.java
Author: Sam

*/

import com.dreamstar.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
