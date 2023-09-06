package com.latam.alura.tienda.modelo;

import javax.persistence.Entity;

@Entity
public class Libros extends Producto {

	private String autor;
	private String paginas;

	public Libros() {
	}

	public Libros(String autor, String paginas) {
		this.autor = autor;
		this.paginas = paginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getPaginas() {
		return paginas;
	}

	public void setPaginas(String paginas) {
		this.paginas = paginas;
	}

}
