package com.company;

import com.company.pets.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PetOwner {
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


    public String toStringUpperCase() {
        return String.format("Person %s (%s)",
                getName().toUpperCase(),getAge()
        );
    }

    @Override
    public String toString() {
        return String.format("Person %s (%s) owns the animals:",
                getName(),getAge());
    }
}
