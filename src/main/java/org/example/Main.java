package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        System.out.println("Hello new world!");
        fileReader(Path.of("/Users/salt-dev/Desktop/TempSaltFolder/data.json"));
    }

    private static ObjectMapper MAPPER = new ObjectMapper();

    private static JsonNode fileReader( Path filePath) throws JsonProcessingException {

        List<String> lines = Collections.emptyList();
        try {
            Files Files = null;
            lines = Files.readAllLines(filePath, StandardCharsets.UTF_8);
        } catch (IOException e)
        {// do something
            e.printStackTrace();
        }
        String singleLine = "";
        for (String line : lines){
            singleLine += line;
        }
        System.out.println(Json.parse(singleLine));
        return Json.parse(singleLine);
    }
}