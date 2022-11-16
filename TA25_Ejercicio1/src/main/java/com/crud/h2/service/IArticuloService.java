package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Articulo;

public interface IArticuloService {
	//Metodos del CRUD
	public List<Articulo> listarArticulos(); //Listar All 
	
	public Articulo guardarArticulo(Articulo articulo);	//Guarda un articulo CREATE
	
	public Articulo articuloXID(int id); //Leer datos de un articulo READ
			
	public List<Articulo> listarArticuloNombre(String nombre);//Listar Articulos por campo nombre
			
	public Articulo actualizarArticulo(Articulo articulo); //Actualiza datos del articulo UPDATE
			
	public void eliminarArticulo(int id);// Elimina el articulo DELETE
}
