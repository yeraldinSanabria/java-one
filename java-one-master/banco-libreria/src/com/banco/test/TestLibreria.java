package com.banco.test;

import com.proyectoBancario.Cuenta;
import com.proyectoBancario.CuentaAhorros;

public class TestLibreria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Cuenta cuenta = new CuentaAhorros(12, 12);
     cuenta.depositar(200);

	}

}
