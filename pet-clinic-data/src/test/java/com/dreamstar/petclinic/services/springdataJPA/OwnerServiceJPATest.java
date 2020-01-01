package com.dreamstar.petclinic.services.springdataJPA;

import com.dreamstar.petclinic.model.Owner;
import com.dreamstar.petclinic.repository.OwnerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

/*

ID: OwnerServiceJPATest.java
Author: Sam

*/
@ExtendWith(MockitoExtension.class)
class OwnerServiceJPATest {

    @Mock
    OwnerRepository ownerRepository;

    @InjectMocks
    OwnerServiceJPA ownerServiceJPA;

    @BeforeEach
    void setUp() {
        Owner owner = Owner.builder()
                .id(3L)
                .lastName("Smith")
                .firstName("Green")
                .build();
        when(ownerRepository.findOwnerById(anyLong())).thenReturn(owner);
    }

    @Test
    void findById() {
        Owner testOwner = ownerServiceJPA.findById(1L);
        assertEquals(3L, testOwner.getId());
    }
}