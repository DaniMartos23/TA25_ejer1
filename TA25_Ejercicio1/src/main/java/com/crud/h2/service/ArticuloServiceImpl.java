package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IArticulosDAO;
import com.crud.h2.dto.Articulo;


@Service
public class ArticuloServiceImpl implements IArticuloService{
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	IArticulosDAO iArticulosDAO;
	
	@Override
	public List<Articulo> listarArticulos() {
		// TODO Auto-generated method stub
		return iArticulosDAO.findAll();
	}

	@Override
	public Articulo guardarArticulo(Articulo articulo) {
		// TODO Auto-generated method stub
		return iArticulosDAO.save(articulo);
	}

	@Override
	public Articulo articuloXID(int id) {
		// TODO Auto-generated method stub
		return iArticulosDAO.findById(id).get();
	}

	@Override
	public List<Articulo> listarArticuloNombre(String nombre) {
		// TODO Auto-generated method stub
		return iArticulosDAO.findByNombre(nombre);
	}

	@Override
	public Articulo actualizarArticulo(Articulo articulo) {
		// TODO Auto-generated method stub
		return iArticulosDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(int id) {
		
		iArticulosDAO.deleteById(id);
		
	}
	
	

}
