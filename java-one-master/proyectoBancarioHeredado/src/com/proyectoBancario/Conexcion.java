package com.proyectoBancario;

public class Conexcion implements AutoCloseable {

	public Conexcion() {
		       System.out.println("Abriendo conexion");
		   }

	public void leerDatos() {
		System.out.println("Recibiendo datos");
		throw new IllegalStateException();
	}

	public void cerrar() {
		System.out.println("Cerrando conexion");
	}

	@Override
	public void close() throws Exception {
		cerrar();
		
	}
}
