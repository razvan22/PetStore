package com.company;

import com.company.pets.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class PetOwner{
    private String name;
    private int age;
    public List<Pet> pets = new ArrayList<>();

    public PetOwner(String name,List<Pet> pets) {
        this.name = name;
        Random r = new Random();
        this.age = 20 + r.nextInt(20);
        this.pets = pets;
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

    public String toStringUpperCase() {
        return String.format("Person %s (%d) owns the animals:",
                getName().toUpperCase() ,getAge());

    }

    @Override
    public String toString() {
        return String.format("Person %s (%d) owns the animals:",
                getName(),getAge());
    }

}
