package com.dreamstar.petclinic.services;

import com.dreamstar.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/*

ID: OwnerService.java
Author: Sam

*/public interface OwnerService extends CrudRepository<Owner, Long> {
}
