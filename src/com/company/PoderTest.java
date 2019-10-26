package com.company;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class PoderTest {
    @Test
    public void testAumentaSuPoder() {
        int nuevo = 1;
        Poder nuevoPoder;
        nuevoPoder = new Poder();
        nuevoPoder.aumentarPoder(nuevo);
        assertEquals(nuevoPoder.getPoder(), 1);
    }

}