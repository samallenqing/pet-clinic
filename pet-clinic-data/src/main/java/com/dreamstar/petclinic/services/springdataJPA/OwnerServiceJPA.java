package com.dreamstar.petclinic.services.springdataJPA;
/*

ID: OwnerServiceJPA.java
Author: Sam

*/

import com.dreamstar.petclinic.model.Owner;
import com.dreamstar.petclinic.repository.OwnerRepository;
import com.dreamstar.petclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerServiceJPA implements OwnerService {
    private final OwnerRepository ownerRepository;

    public OwnerServiceJPA(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Set<Owner> findAll() {
       return (Set<Owner>) this.ownerRepository.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return ownerRepository.findOwnerById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return this.ownerRepository.save(owner);
    }

    @Override
    public void delete(Owner object) {
        this.ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        this.ownerRepository.deleteById(aLong);
    }
}
