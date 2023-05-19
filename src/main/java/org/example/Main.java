package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello new world!");
    }

    private static ObjectMapper MAPPER = new ObjectMapper();

//    public static String fileDataReader(String s) {
//        Path fileName = Path.of("/Users/salt-dev/Desktop/TempSaltFolder/data.json");
//
//        ObjectMapper mapper = new ObjectMapper();
//
//// De-serialize to an object
//        Person user = mapper.readTree("Somehting");
//        System.out.println(user.name); //John
//
//// Read a single attribute
//        JsonNode nameNode = mapper.readTree("{\"name\": \"John\"}");
//        System.out.println(name.get("name").asText());
//
//        return fileName.toString();
//
//    }

}