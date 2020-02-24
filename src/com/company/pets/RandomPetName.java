package com.company.pets;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomPetName {


    public static String getName() {
        Random random = new Random();
        List<String> list = new ArrayList<>();

        try {
            list = Files.lines(Paths.get("pet-names-4.txt"))
                    .flatMap (s -> Stream.of(s.split("[. ,\"]")))
                    .filter(s -> s.length() > 2)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int randomName  = random.nextInt(list.size());
        return list.remove(randomName);
    }

}
