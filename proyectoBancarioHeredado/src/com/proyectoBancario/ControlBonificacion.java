package com.proyectoBancario;

public class ControlBonificacion {

	private double suma;

	public double resgistrarSalario(Funcionario funcionario) {
		this.suma = funcionario.getBonoficacion() + this.suma;
		System.out.println("calculo actual " + this.suma);
		return this.suma;
	}
}
	