package com.company;

import com.company.pets.Pet;

import java.util.ArrayList;
import java.util.List;

public class PetOwner {
    private String name;
    private int age;
    private List<Pet> pets = new ArrayList<>();

    public PetOwner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void addPet(Pet pet) {
        if (pet != null){
            pets.add(pet);
        }
    }

    @Override
    public String toString() {
        return String.format("\"%-8s (%-8s) %8.2f   %s\",",
                getName(),getAge()
                );
    }
}
