package com.javawhizz;

public class Main {
    public static void main(String[] args) {

        JSONFileReader jsonFileReader =
                new JSONFileReader();
        jsonFileReader.readStudentsFromJSONFile()
                .forEach(System.out::println);
    }
}