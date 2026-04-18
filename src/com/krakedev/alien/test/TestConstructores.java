package com.krakedev.alien.test;

import com.krakedev.alien.Alien;

public class TestConstructores {

	public static void main(String[] args) {
		

	        Alien a1 = new Alien(3, "Verde");   
	        Alien a2 = new Alien(40, "Rojo");   

	        a1.imprimir();
	        System.out.println("---------------");
	        a2.imprimir();
	}

}
