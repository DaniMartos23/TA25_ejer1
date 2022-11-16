package com.crud.h2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Fabricante;

public interface IFabricantesDAO extends JpaRepository<Fabricante, Integer> {
	
	//Listar fabricantes por campo nombre
		public List<Fabricante> findByNombre(String nombre);
}
