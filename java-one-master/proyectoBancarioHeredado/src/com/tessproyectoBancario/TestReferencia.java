package com.tessproyectoBancario;

import com.proyectoBancario.*;

public class TestReferencia {

	public static void main(String[] args) {
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("yeral");

		Gerente gerente = new Gerente();
		gerente.setNombre("elkin");
		
		Contador contador = new Contador();
		contador.setNombre("alexis");

		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		contador.setSalario(5000);

	}

}
