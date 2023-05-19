package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonTest {

    String fileData = "{\n" +
            "    \"name\": \"Jason Ray\",\n" +
            "    \"profession\": \"Software Engineer\",\n" +
            "    \"age\": 31,\n" +
            "    \"address\": {\n" +
            "        \"city\": \"New York\",\n" +
            "        \"postalCode\": 64780,\n" +
            "        \"Country\": \"USA\"\n" +
            "    },\n" +
            "    \"languages\": [\"Java\", \"Node.js\", \"JavaScript\", \"JSON\"],\n" +
            "    \"socialProfiles\": [\n" +
            "        {\n" +
            "            \"name\": \"Twitter\",\n" +
            "            \"link\": \"https://twitter.com\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"name\": \"Facebook\",\n" +
            "            \"link\": \"https://www.facebook.com\"\n" +
            "        }\n" +
            "    ]\n" +
            "}";

    @Test
    void shouldReturnFile() throws JsonProcessingException {
        assertEquals("""
                        {"name":"Jason Ray","profession":"Software Engineer","age":31,"address":{"city":"New York","postalCode":64780,"Country":"USA"},"languages":["Java","Node.js","JavaScript","JSON"],"socialProfiles":[{"name":"Twitter","link":"https://twitter.com"},{"name":"Facebook","link":"https://www.facebook.com"}]}"""
                , Json.parse(fileData).toString());
    }

}