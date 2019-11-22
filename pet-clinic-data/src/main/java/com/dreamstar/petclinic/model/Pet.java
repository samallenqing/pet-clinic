package com.dreamstar.petclinic.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Pet extends BaseEntity {

    private PetType petType;
    private Owner owner;
    private Date birthDate;
}
