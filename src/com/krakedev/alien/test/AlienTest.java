package com.krakedev.alien.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.alien.Alien;

public class AlienTest {

    @Test
    public void testTamanoMinimo() {
        Alien alien = new Alien(2, "Verde");
        assertEquals(5, alien.getTamanio());
    }

    @Test
    public void testTamanoMaximo() {
        Alien alien = new Alien(50, "Rojo");
        assertEquals(30, alien.getTamanio());
    }

    @Test
    public void testPrecioCuerpo() {
        Alien alien = new Alien(10, "Azul");
        assertEquals(2.0, alien.getPrecioCuerpo());
    }


}
