package com.company;


import com.company.pets.Pet;
import com.company.pets.RandomPetName;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

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
/*=======================================================================*/
        owners.stream()
                .map(s -> s.toString() + s.pets)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("=======================================================================");
/*=======================================================================*/
        owners.stream()
                .filter(c -> c.pets.size() != 0)
                .map(petOwner -> petOwner.toString() +  petOwner.pets.stream()
                        .map(pet -> pet.toString())
                        .sorted()
                        .collect(Collectors.toList()))
                .sorted()
                .forEach(System.out::println);
        System.out.println("=======================================================================");
/*=======================================================================*/

        Comparator<PetOwner> ascendingListFormat = (petA, petB) -> petA.pets.size() - petB.pets.size();

        Consumer<PetOwner> filterOwnerWitOnePet = owner -> {
            if (owner.pets.size() == 1){
                String pet  = owner.pets.toString().replaceAll("[\\[\\]]", "");
                System.out.println(owner.toStringUpperCase() +" "+ pet);
            }else{
                System.out.println(owner.toStringUpperCase() + owner.getPets().toString());
            }
        };

        owners.stream()
                .sorted(ascendingListFormat)
                .filter(c -> c.pets.size() != 0)
                .forEach(filterOwnerWitOnePet);

    }

    public static List<Pet> randomPet(){
        Random random = new Random();
        int petNr = random.nextInt(5);
        List<Pet> pets = new ArrayList<>();
        String[] type = {"Dog:","Cat:","Parrot:","TRex:","Crocodile:"};

        for (int i = 0; i < petNr; i++){
            int randomType = random.nextInt(type.length);
            pets.add(new Pet(type[randomType],RandomPetName.getName()));
        }
        pets = pets.stream().sorted().collect(Collectors.toList());
     return pets;
    }
}
