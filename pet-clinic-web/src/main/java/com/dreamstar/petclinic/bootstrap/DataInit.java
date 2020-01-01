package com.dreamstar.petclinic.bootstrap;
/*

ID: DataInit.java
Author: Sam

*/

import com.dreamstar.petclinic.model.*;
import com.dreamstar.petclinic.services.OwnerService;
import com.dreamstar.petclinic.services.PetService;
import com.dreamstar.petclinic.services.PetTypeService;
import com.dreamstar.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

@Component
public class DataInit implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetService petService;
    private final PetTypeService petTypeService;

    public DataInit(OwnerService ownerServicel, VetService vetService, PetService petService, PetTypeService petTypeService) {
        this.ownerService = ownerServicel;
        this.vetService = vetService;
        this.petService = petService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        if (petTypeService.findAll().size() == 0)
            loadData();
    }

    private void loadData() {
        PetType dog = new PetType();

        PetType cat = new PetType();

        petTypeService.save(dog);
        petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setPhoneNumber("1231231234");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(dog);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(Calendar.getInstance().getTime());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();

        owner2.setFirstName("Michael");
        owner2.setLastName("Weston");
        owner2.setAddress("123 Brickerel");
        owner2.setCity("Miami");
        owner2.setPhoneNumber("1231231234");

        Pet fionasCat = new Pet();
        fionasCat.setPetType(cat);
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(Calendar.getInstance().getTime());
        fionasCat.setName("Just Cat");
        owner2.getPets().add(fionasCat);

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");

        Set<Speciality> specialities = new HashSet<>();
        specialities.add(radiology);

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.setSpecialities(specialities);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("asdf");
        vet2.setSpecialities(specialities);

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
//        PetType dog = new PetType();
//        dog.setName("Dog");
//        PetType savedDogPetType = petTypeService.save(dog);
//
//        PetType cat = new PetType();
//        cat.setName("Cat");
//        PetType savedCatPetType = petTypeService.save(cat);
//

//        Speciality savedRadiology = specialtyService.save(radiology);
//
//        Speciality surgery = new Speciality();
//        surgery.setDescription("Surgery");
//        Speciality savedSurgery = specialtyService.save(surgery);
//
//        Speciality dentistry = new Speciality();
//        dentistry.setDescription("dentistry");
//        Speciality savedDentistry = specialtyService.save(dentistry);
//
//        Owner owner1 = new Owner();
//        owner1.setFirstName("Michael");
//        owner1.setLastName("Weston");
//        owner1.setAddress("123 Brickerel");
//        owner1.setCity("Miami");
//        owner1.setPhoneNumber("1231231234");
//
//        Pet mikesPet = new Pet();
//        mikesPet.setPetType(savedDogPetType);
//        mikesPet.setOwner(owner1);
//        mikesPet.setBirthDate(LocalDate.now());
//        mikesPet.setName("Rosco");
//        owner1.getPets().add(mikesPet);
//
//        ownerService.save(owner1);
//
//        Owner owner2 = new Owner();
//        owner2.setFirstName("Fiona");
//        owner2.setLastName("Glenanne");
//        owner2.setAddress("123 Brickerel");
//        owner2.setCity("Miami");
//        owner2.setPhoneNumber("1231231234");
//
//        Pet fionasCat = new Pet();
//        fionasCat.setName("Just Cat");
//        fionasCat.setOwner(owner2);
//        fionasCat.setBirthDate(LocalDate.now());
//        fionasCat.setPetType(savedCatPetType);
//        owner2.getPets().add(fionasCat);
//
//        ownerService.save(owner2);
//
//        Visit catVisit = new Visit();
//        catVisit.setPet(fionasCat);
//        catVisit.setDate(LocalDate.now());
//        catVisit.setDescription("Sneezy Kitty");
//
//        visitService.save(catVisit);
//
//        System.out.println("Loaded Owners....");
//
//        Vet vet1 = new Vet();
//        vet1.setFirstName("Sam");
//        vet1.setLastName("Axe");
//        vet1.getSpecialities().add(savedRadiology);
//
//        vetService.save(vet1);
//
//        Vet vet2 = new Vet();
//        vet2.setFirstName("Jessie");
//        vet2.setLastName("Porter");
//        vet2.getSpecialities().add(savedSurgery);
//
//        vetService.save(vet2);
//
//        System.out.println("Loaded Vets....");
    }
}
