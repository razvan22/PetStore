package com.company;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PetName {
    List<String> names = new ArrayList<>();



    public PetName() throws IOException {

    }
    public void showAllNames() throws IOException {
//        Files.lines(Paths.get("pet-names-4.txt")).forEach(System.out::println);

        names = Files.lines(Paths.get("pet-names-4.txt"))

                .flatMap (s -> Stream.of(s.split(", ")))
                .sorted((s1, s2) -> {
                    return s1.compareTo(s2);
                })
                .collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}

class TestClass{
    public static void main(String[] args) throws IOException {
        PetName petName = new PetName();
        petName.showAllNames();

    }
}
