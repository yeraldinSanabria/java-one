package com.tessproyectoBancario;

import java.util.ArrayList;

import com.proyectoBancario.CuentaCorriente;
import com.proyectoBancario.Cuenta;

public class TessArrayList {

	public static void main(String[] args) {
		//<> forzando a que acepte solo in tipo de objeto 
		ArrayList lista  = new ArrayList();
		Cuenta cc = new CuentaCorriente(22, 11);
		Cuenta cc2 = new CuentaCorriente(23, 13);

		lista.add(cc);
		lista.add(cc2);
		
		Cuenta obtenerCuenta = (Cuenta) lista.get(0);
		System.out.println(obtenerCuenta);
	
		for(int i = 0; i <lista.size(); i++);
		System.out.println(lista.get(0));
	}

}
