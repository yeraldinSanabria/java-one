package com.tessproyectoBancario;

import java.util.ArrayList;
import java.util.List;

import com.proyectoBancario.*;

public class TessOrdenarLista {

	public static void main(String[] args) {

		Cuenta cc2 = new CuentaCorriente(22, 11);
		cc2.depositar(444.0);

		Cuenta cc3 = new CuentaCorriente(11, 22);
		cc3.depositar(111.0);

		Cuenta cc4 = new CuentaAhorros(22, 11);
		cc4.depositar(222.0);

		List<Cuenta> lista = new ArrayList<>();
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		System.out.println();
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		// ordenar las cuentas
		// la variable que espera es cualquier cosa que extienda de cuenta
		Comparator<Cuenta> comparator = new OrdenadorPorNumeroCuenta();
		lista.sort(comparator);
	}

	class OrdenadorPorNumeroCuenta implements Comparator<Cuenta> {

		public int compare(Cuenta o1, Cuenta o2) {
			if (o1.getNumero() > o2.getNumero()) {
				//este get puede llamar la lista que queremos ejemplo get.nombre
				return 1;
			} else {
				return -1;
			}
		}
	}
	// clase anonima
	// Collections.sort(lista, new Comparator<Cuenta>(){
	//@override
	//public int compare(Cuenta o1, Cuenta o2) {
		//return o1.getTitular().getNombre().compareToo2.getTitular().getNombre();
	//}

}
