package com.dreamstar.petclinic.controllers;

import com.dreamstar.petclinic.model.Owner;
import com.dreamstar.petclinic.services.OwnerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/*

ID: OwnerControllerTest.java
Author: Sam

*/
@ExtendWith(MockitoExtension.class)
class OwnerControllerTest {

    @Mock
    OwnerService ownerService;

    @InjectMocks
    OwnerController ownerController;

    MockMvc mockMvc;


    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders
                .standaloneSetup(ownerController)
                .build();
        Set<Owner> ownerSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            ownerSet.add(Owner.builder()
                    .id(Long.valueOf(i))
                    .firstName("Jason" + String.valueOf(i))
                    .build());
        }

        when(ownerService.findAll()).thenReturn(ownerSet);
    }

    @Test
    void listVets() throws Exception {
        mockMvc.perform(get("/owners/index"))
                .andExpect(status().isOk())
                .andExpect(view().name("owners/index"))
                .andExpect(model().attribute("owners", hasSize(10)));
    }
}