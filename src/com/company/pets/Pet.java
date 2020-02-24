package com.company.pets;



public  class Pet {
    private String petName ;
    private String type;

    public Pet(String petName, String type) {
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
