package com.dreamstar.petclinic.model;


import lombok.Data;

@Data
public class Vet extends Person{
    public Vet(String firstName, String lastName) {
        super(firstName, lastName);
    }
}
