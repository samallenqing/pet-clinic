package com.dreamstar.petclinic.model;

import lombok.*;

import javax.persistence.Entity;

/*

ID: Speciality.java
Author: Sam

*/
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Speciality extends BaseEntity {
    private String description;
}
