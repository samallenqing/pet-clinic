package com.dreamstar.petclinic.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PetType extends BaseEntity {

    private String name;
}
