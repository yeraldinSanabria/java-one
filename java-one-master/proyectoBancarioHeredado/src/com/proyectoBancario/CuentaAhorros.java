package com.proyectoBancario;

public class CuentaAhorros extends Cuenta {

	public CuentaAhorros(int agencia, int numero) {
		super(agencia, numero);
	}

	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}

}
