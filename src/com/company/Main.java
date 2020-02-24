package com.company;


import com.company.pets.Pet;
import com.company.pets.RandomPetName;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<PetOwner> owners = List.of(
                new PetOwner("Mike",randomPet()),
                new PetOwner("Joe",randomPet()),
                new PetOwner("Jan",randomPet()),
                new PetOwner("Bob",randomPet()),
                new PetOwner("Tom",randomPet()),
                new PetOwner("Pet",randomPet()),
                new PetOwner("Ana",randomPet()),
                new PetOwner("Get",randomPet()),
                new PetOwner("Mary",randomPet()),
                new PetOwner("Clara",randomPet()),
                new PetOwner("Fis",randomPet()),
                new PetOwner("Sam",randomPet()),
                new PetOwner("Jasmine",randomPet())
        );

        randomPet();

        owners.stream()
                .map(s -> s.toString())
                .collect(Collectors.toList())
                .forEach(System.out::println);
//
////        System.out.println(mike.toString());

    }
    public static List<Pet> randomPet(){
        Random random = new Random();
        int petNr = random.nextInt(5);
        List<Pet> pets = new ArrayList<>();
        String[] type = {"Dog","Cat"};

        for (int i = 0; i < petNr; i++){
            int randomType = random.nextInt(type.length);
            pets.add(new Pet(RandomPetName.getName(),type[randomType]));
        }
     return pets;
    }
}
