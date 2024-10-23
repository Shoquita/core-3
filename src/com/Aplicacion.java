package com;
import com.clases.*;
public class Aplicacion {

		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	TiendaElectronica tienda = new TiendaElectronica();
	Televisor tv = new Televisor("LG", 300000, 4 , 27 , "1080p");
	computadoraPortatil lapto = new computadoraPortatil("Pavilion", 1000000, 2, "HP", 16, "3345jp");
	tienda.agregar(tv);
	tienda.agregar(lapto);
	tienda.venta("LG", 2);
	tienda.venta("Pavilion ", 20);
	System.out.println();
	tienda.mostrar();
		}

	
	}


