package com.latam.alura.tienda.dao;

import javax.persistence.EntityManager;

import com.latam.alura.tienda.modelo.Producto;

public class ProductoDao {

	private EntityManager em;


	public ProductoDao(EntityManager em) {
		this.em = em;
	}

	public void guardar(Producto producto) {
		this.em.persist(producto);
	}
	
}
