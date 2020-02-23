package com.company;

import javax.swing.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PetName {
    Map<String,String> names = new HashMap();



    public PetName() throws IOException {

    }
    public static void showAllNames() throws IOException {

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

    }
}

class TestClass{
    public static void main(String[] args) throws IOException {

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


    }
}
