package com.crud.h2.service;

import java.util.List;
import com.crud.h2.dto.Fabricante;

public interface IFabricanteService {
	//Metodos del CRUD
		public List<Fabricante> listarFabricantes(); //Listar All 
		
		public Fabricante guardarFabricante(Fabricante fabricante);	//Guarda un fabricante CREATE
		
		public Fabricante fabricanteXID(int id); //Leer datos de un fabricante READ
		
		public List<Fabricante> listarFabricanteNombre(String nombre);//Listar Fabricantes por campo nombre
		
		public Fabricante actualizarFabricante(Fabricante fabricante); //Actualiza datos del fabricante UPDATE
		
		public void eliminarFabricante(int id);// Elimina el fabricante DELETE
}
