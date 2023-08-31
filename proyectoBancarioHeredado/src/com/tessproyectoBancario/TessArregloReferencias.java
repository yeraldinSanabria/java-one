package com.tessproyectoBancario;

import com.proyectoBancario.*;

public class TessArregloReferencias {

	public static void main(String[] args) {
		
		Cuenta cc = new CuentaCorriente(22, 44);
		
		Cuenta[] cuentas = new CuentaCorriente[5];
		cuentas[1] = cc;
		
		System.out.println(cc);
		System.out.println(cuentas[1]);
		
		cuentas[0] = new CuentaCorriente(11, 99);

	}

}
