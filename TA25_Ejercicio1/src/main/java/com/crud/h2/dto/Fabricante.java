package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="fabricantes")//en caso que la tabala sea diferente
public class Fabricante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde codigo final de db
	private int codigo;
	@Column(name = "nombre")
	private String nombre;

	@OneToMany
    @JoinColumn(name="codigo")
    private List<Articulo> articulos;
	
	public Fabricante() {
		
	}
	
	public Fabricante(int codigo, String nombre,List<Articulo> articulos) {
		//super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.articulos= articulos;
	}

	/**
	 * @return codigo
	 */
	
	public int getCodigo() {
		return codigo;
	}
	
	/**
	 * 
	 * @param codigo
	 */

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * @return nombre
	 */

	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	/**
	 * 
	 * @return articulos
	 */
	
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "articulos")
	public List<Articulo> getArticulos() {
		return articulos;
	}
	
	/**
	 * 
	 * @param articulos
	 */
	
	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}

	@Override
	public String toString() {
		return "Fabricante [codigo=" + codigo + ", nombre=" + nombre + ", articulos=" + articulos + "]";
	}
	
	
	
}
