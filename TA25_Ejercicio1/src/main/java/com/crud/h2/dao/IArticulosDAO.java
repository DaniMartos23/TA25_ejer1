package com.crud.h2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Articulo;

public interface IArticulosDAO extends JpaRepository<Articulo, Integer> {
	//Listar articulos por campo nombre
			public List<Articulo> findByNombre(String nombre);
}
