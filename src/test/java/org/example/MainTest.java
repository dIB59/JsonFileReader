package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.awt.Event.HOME;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    String FILE_LOCATION = "/Users/salt-dev/Desktop/TempSaltFolder/data.json";
    @Test
    void fileShouldExist() {
        Path p = Path.of(FILE_LOCATION);
        assertTrue(Files.exists(p));
    }

    @Test
    public void givenPathIsAFile() {
        Path p = Path.of(FILE_LOCATION);
        assertTrue(Files.isRegularFile(p));
    }

    @Test
    void shouldReturnFile() {
        assertEquals("/Users/salt-dev/Desktop/TempSaltFolder/data.json", Main.fileDataReader(FILE_LOCATION));
    }


}