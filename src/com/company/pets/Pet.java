package com.company.pets;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public  class Pet {
    private String petName = randomPetName();
    private String type;

    public Pet(String type) throws IOException {
        this.type = type;
    }

    public String getPetName() {
        return petName;
    }

    public String getType() {
        return type;
    }

    private String randomPetName() throws IOException {
        Random random = new Random();
        List<String> list = new ArrayList<>();

        Pattern pattern = Pattern.compile("\\s+");
        Files.lines(Paths.get("pet-names-4.txt"))
                .flatMap (s -> Stream.of(s.split(". ")))
                .flatMap(line -> pattern.splitAsStream(line))
                .filter(s -> s.length() > 3)
                .flatMap (s -> Stream.of(s.split("\"")))
                .flatMap (s -> Stream.of(s.split(",")))
                .collect(Collectors.toList())
                .forEach(s -> list.add(s));
        int randomName  = random.nextInt(list.size());
        return list.get(randomName);
    }
}
