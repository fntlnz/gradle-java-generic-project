package com.fontanalorenzo.example;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * Application test
 */
public class ApplicationTest {
    @Test
    public void randomNumberTest() {
        Application app = new Application();
        double random = app.randomNumber();
        assertTrue(0 <= random && random <= 5);
    }
}