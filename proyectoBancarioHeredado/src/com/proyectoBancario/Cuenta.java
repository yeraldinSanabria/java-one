package com.proyectoBancario;

public abstract class Cuenta {

	private static int total;
	protected double saldo;
	private int agencia;
	private int numero;
	Cliente titular = new Cliente();

	// no retorna valor
	public abstract void depositar(double valor);

	// crear cuenta
	public Cuenta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		Cuenta.total++;
	}

	// retorna valor
	
	/**
	 * Este metodo retira dinero de la cuenta 
	 * @param valor
	 * @return
	 */
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.retirar(valor);
			cuenta.depositar(valor);
			return true;
		}
		return false;

	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia > 0) {
			this.agencia = agencia;
		}

	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
}
