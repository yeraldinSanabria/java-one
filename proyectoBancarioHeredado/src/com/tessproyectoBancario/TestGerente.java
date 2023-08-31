package com.tessproyectoBancario;

import com.proyectoBancario.Gerente;

public class TestGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		//Funcionario gerente = new Funcionario();
		gerente.setNombre("Abril");
		gerente.setDocumento("er56tyui");
		gerente.setSalario(6000);
		gerente.setTipo(1);
		gerente.setClave("yeraldin");

		System.out.println(gerente.getSalario());
		//System.out.println(gerente.iniciarSesion("eraldin"));
		System.out.println(gerente.getBonoficacion());
		//System.out.println(gerente.getSalario() + gerente.getBonoficacion());
	}
}
