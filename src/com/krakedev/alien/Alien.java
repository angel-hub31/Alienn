package com.krakedev.alien;

public class Alien {
	private int tamanio;
	private String color;
	private int numeroOjos;
	private int numeroBrazos;
	private int numeroPies;
	private double precioExtremidad;
	private double precioOjo;
	private double precioCuerpo;
	private double precioTotal;

	public Alien(int tamanio, String color) {

		if (tamanio < 5) {
			this.tamanio = 5;
		} else if (tamanio > 30) {
			this.tamanio = 30;
		} else {
			this.tamanio = tamanio;
		}

		this.color = color;

		this.numeroOjos = 0;
		this.numeroBrazos = 0;
		this.numeroPies = 0;

		this.precioCuerpo = this.tamanio * 0.20;
		this.precioExtremidad = this.tamanio * 0.10;
		this.precioOjo = this.tamanio * 0.05;

		this.precioTotal = 0;

		calcularPrecioTotal();
	}
	public boolean agregarBrazos(int cantidad) {
	    int total = this.numeroBrazos + this.numeroPies + cantidad;

	    if (total > 10) {
	        return false;
	    }

	    this.numeroBrazos += cantidad;
	    calcularPrecioTotal();
	    return true;
	}

	public boolean agregarPies(int cantidad) {
	    int total = this.numeroBrazos + this.numeroPies + cantidad;

	    if (total > 10) {
	        return false;
	    }

	    this.numeroPies += cantidad;
	    calcularPrecioTotal();
	    return true;
	}
	
	public boolean agregarOjos(int cantidad) {

	    int maxOjos;

	    if (tamanio <= 10) {
	        maxOjos = 3;
	    } else if (tamanio <= 20) {
	        maxOjos = 5;
	    } else {
	        maxOjos = 7;
	    }

	    if (this.numeroOjos + cantidad > maxOjos) {
	        return false;
	    }

	    this.numeroOjos += cantidad;
	    calcularPrecioTotal();
	    return true;
	}
	private void calcularPrecioTotal() {
	    this.precioTotal = this.precioCuerpo +
	            (this.numeroOjos * this.precioOjo) +
	            ((this.numeroBrazos + this.numeroPies) * this.precioExtremidad);
	}

	public int getTamanio() {
		return tamanio;
	}

	public String getColor() {
		return color;
	}

	public int getNumeroOjos() {
		return numeroOjos;
	}

	public int getNumeroBrazos() {
		return numeroBrazos;
	}

	public int getNumeroPies() {
		return numeroPies;
	}

	public double getPrecioExtremidad() {
		return precioExtremidad;
	}

	public double getPrecioOjo() {
		return precioOjo;
	}

	public double getPrecioCuerpo() {
		return precioCuerpo;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void imprimir() {
		System.out.println("Tamaño: " + tamanio);
		System.out.println("Color: " + color);
		System.out.println("Brazos: " + numeroBrazos);
		System.out.println("Piernas: " + numeroPies);
		System.out.println("Ojos: " + numeroOjos);
		System.out.println("Precio total: " + precioTotal);
	}

}
