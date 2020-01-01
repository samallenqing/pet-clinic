package com.dreamstar.petclinic.services.map;

import com.dreamstar.petclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*

ID: OwnerMapServiceTest.java
Author: Sam

*/
class OwnerMapServiceTest {

    OwnerMapService ownerMapService;

    @BeforeEach
    void setUp() {
        ownerMapService = new OwnerMapService();
        ownerMapService.save(Owner
                .builder()
                .id(2L)
                .firstName("jack")
                .build());
    }

    @Test
    void findById() {
        assertEquals(2L, ownerMapService.findById(2L).getId());
    }
}