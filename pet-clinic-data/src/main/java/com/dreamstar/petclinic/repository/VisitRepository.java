package com.dreamstar.petclinic.repository;
/*

ID: VisitRepository.java
Author: Sam

*/

import com.dreamstar.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
