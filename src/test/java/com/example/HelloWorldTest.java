package com.example;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class HelloWorldTest {
    @Test
    public void testHelloWorld() {
        HelloWorld.main(null);
        assertTrue(true);
    }
}