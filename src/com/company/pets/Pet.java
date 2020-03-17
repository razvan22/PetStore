package com.company.pets;



public  class Pet implements Comparable<Pet> {
    private String petName ;
    private String type;

    @Override
    public int compareTo(Pet pet) {
        return this.getType().compareToIgnoreCase(pet.petName);
    }

    public Pet( String type ,String petName) {
        this.petName = petName;
        this.type = type;
    }

    public String getPetName() {
        return petName;
    }

    public String getType() {
        return type;
    }


    @Override
    public String toString() {
        return String.format("%s %s",getType(),getPetName());
    }



}
