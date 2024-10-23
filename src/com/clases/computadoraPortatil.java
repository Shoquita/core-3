package com.clases;

public class computadoraPortatil extends ProductoElectrodomestico {
	private String marca;
	private int memoriaRam;
	private String numeroSerie;
	public computadoraPortatil(String nombre, double precio, int cantidadDisponible, String marca, int memoriaRam,
			String numeroSerie) {
		super(nombre, precio, cantidadDisponible);
		this.marca = marca;
		this.memoriaRam = memoriaRam;
		this.numeroSerie = numeroSerie;
	}
	@Override
		public void mostrarInformacion() {
			// TODO Auto-generated method stub
			super.mostrarInformacion();
			System.out.println("marca " + marca );
			System.out.println("memoriaRam " + memoriaRam );
			System.out.println("numeroSerie " + numeroSerie );
				
			}
	}

