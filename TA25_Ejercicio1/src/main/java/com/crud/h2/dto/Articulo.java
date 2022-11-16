package com.crud.h2.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="articulos")//en caso que la tabala sea diferente
public class Articulo {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde codigo final de db
	private int codigo;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "precio")
	private int precio;
	
	@ManyToOne()
    @JoinColumn(name = "codfabricante")
    Fabricante fabricantes;
	
	public Articulo() {
		
	}
	
	
	
	public Articulo(int codigo, String nombre, int precio, Fabricante fabricantes) {
		//super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.fabricantes = fabricantes;
	}



	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Fabricante getFabricantes() {
		return fabricantes;
	}

	public void setFabricantes(Fabricante fabricantes) {
		this.fabricantes = fabricantes;
	}



	@Override
	public String toString() {
		return "Articulo [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", fabricantes="
				+ fabricantes + "]";
	}

	
	
}
