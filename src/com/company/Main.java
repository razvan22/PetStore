package com.company;


import com.company.pets.Pet;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Pet pet = new Pet("Dog");
        Pet pet2 = new Pet("Cat");

        PetOwner mike = new PetOwner("Mike",20);
        mike.addPet(pet);
        mike.addPet(pet2);
        

    }
}
