package com.krakedev.alien.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.alien.Alien;

public class AlienTestJUnitAI {
	@Test
    public void testTamanioMenorAlMinimo() {
        Alien alien = new Alien(3, "Verde");

        assertEquals(5, alien.getTamanio());
    }

    @Test
    public void testTamanioMayorAlMaximo() {
        Alien alien = new Alien(50, "Rojo");

        assertEquals(30, alien.getTamanio());
    }

    @Test
    public void testTamanioValido() {
        Alien alien = new Alien(10, "Azul");

        assertEquals(10, alien.getTamanio());
    }

    @Test
    public void testColor() {
        Alien alien = new Alien(10, "Morado");

        assertEquals("Morado", alien.getColor());
    }

    @Test
    public void testValoresInicialesExtremidadesYOjos() {
        Alien alien = new Alien(10, "Negro");

        assertEquals(0, alien.getNumeroOjos());
        assertEquals(0, alien.getNumeroBrazos());
        assertEquals(0, alien.getNumeroPies());
    }

    @Test
    public void testPrecioCuerpo() {
        Alien alien = new Alien(10, "Gris");

        assertEquals(2.0, alien.getPrecioCuerpo());
    }

    @Test
    public void testPrecioExtremidad() {
        Alien alien = new Alien(10, "Gris");

        assertEquals(1.0, alien.getPrecioExtremidad());
    }

    @Test
    public void testPrecioOjo() {
        Alien alien = new Alien(10, "Gris");

        assertEquals(0.5, alien.getPrecioOjo());
    }

    @Test
    public void testPrecioTotalInicial() {
        Alien alien = new Alien(10, "Gris");

        assertEquals(0.0, alien.getPrecioTotal());
    }

}
