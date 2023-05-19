package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Json {
    private static ObjectMapper MAPPER = new ObjectMapper();

    public static JsonNode parse(String src) throws JsonProcessingException {
        return MAPPER.readTree(src);
    }


}
