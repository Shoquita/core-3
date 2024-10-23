package com.clases;

public class Televisor extends ProductoElectrodomestico {
	private int tamañoPantallas;
	private String resolucion;

	public Televisor(String nombre, double precio, int cantidadDisponible, int tamañoPantallas, String resolucion) {
		super(nombre, precio, cantidadDisponible);
		this.tamañoPantallas = tamañoPantallas;
		this.resolucion = resolucion;
	}

	public int getTamañoPantallas() {
		return tamañoPantallas;
	}

	public void setTamañoPantallas(int tamañoPantallas) {
		this.tamañoPantallas = tamañoPantallas;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	@Override
		public void mostrarInformacion() {
			// TODO Auto-generated method stub
			super.mostrarInformacion();
			System.out.println("tamañoPantalla " + tamañoPantallas );
			System.out.println("resolucion " + resolucion );
		}
	}

