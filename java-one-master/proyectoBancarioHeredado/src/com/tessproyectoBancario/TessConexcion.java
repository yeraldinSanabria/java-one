package com.tessproyectoBancario;

import com.proyectoBancario.Conexcion;

public class TessConexcion {
	public static void main(String[] args) throws Exception {

		try (Conexcion con = new Conexcion();) {
			con.leerDatos();
		} catch (IllegalStateException ex) {
			System.err.println("recibiendo exception");
			ex.printStackTrace();
		}

		/*
		 * Conexcion con = null; try { con = new Conexcion(); con.leerDatos(); } catch
		 * (IllegalStateException ex) { System.err.println("recibiendo exception");
		 * ex.printStackTrace(); } finally { con.cerrar(); }
		 */
	}

}
