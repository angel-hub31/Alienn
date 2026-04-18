package com.krakedev.alien.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.alien.Alien;

public class AlienTestFinal {
	@Test
    public void testPrecioInicial() {
        Alien a = new Alien(10, "Verde");

        assertEquals(2.0, a.getPrecioTotal(), 0.0001);
    }

    @Test
    public void testPrecioConOjos() {
        Alien a = new Alien(10, "Verde");

        a.agregarOjos(2);

        assertEquals(3.0, a.getPrecioTotal(), 0.0001);
    }

    @Test
    public void testPrecioConExtremidades() {
        Alien a = new Alien(10, "Verde");

        a.agregarBrazos(2); 
        a.agregarPies(2);   

        assertEquals(6.0, a.getPrecioTotal(), 0.0001);
    }

    @Test
    public void testPrecioTotalCompleto() {
        Alien a = new Alien(10, "Verde");

        a.agregarOjos(2);      
        a.agregarBrazos(2);    
        a.agregarPies(2);      

        assertEquals(7.0, a.getPrecioTotal(), 0.0001);
    }

    @Test
    public void testLimiteExtremidades() {
        Alien a = new Alien(10, "Azul");

        assertTrue(a.agregarBrazos(5));
        assertTrue(a.agregarPies(5));

        assertFalse(a.agregarBrazos(1));
    }

    @Test
    public void testExtremidadesCombinadas() {
        Alien a = new Alien(10, "Rojo");

        assertTrue(a.agregarBrazos(6));
        assertTrue(a.agregarPies(4));

        assertEquals(10, a.getNumeroBrazos() + a.getNumeroPies());
    }

    @Test
    public void testLimiteOjosPequeno() {
        Alien a = new Alien(10, "Verde");

        assertTrue(a.agregarOjos(3));
        assertFalse(a.agregarOjos(1));
    }

    @Test
    public void testLimiteOjosMediano() {
        Alien a = new Alien(15, "Verde");

        assertTrue(a.agregarOjos(5));
        assertFalse(a.agregarOjos(1));
    }

    @Test
    public void testLimiteOjosGrande() {
        Alien a = new Alien(25, "Verde");

        assertTrue(a.agregarOjos(7));
        assertFalse(a.agregarOjos(1));
    }

    @Test
    public void testNoCambioCuandoFalla() {
        Alien a = new Alien(10, "Negro");

        assertTrue(a.agregarBrazos(5));
        assertTrue(a.agregarPies(5));

        assertFalse(a.agregarBrazos(1));

        assertEquals(10, a.getNumeroBrazos() + a.getNumeroPies());
    }

    @Test
    public void testPrecioNoCambiaSiFalla() {
        Alien a = new Alien(10, "Negro");

        a.agregarBrazos(5);
        a.agregarPies(5);

        double precioAntes = a.getPrecioTotal();

        a.agregarBrazos(1);

        assertEquals(precioAntes, a.getPrecioTotal(), 0.0001);
    }

}
