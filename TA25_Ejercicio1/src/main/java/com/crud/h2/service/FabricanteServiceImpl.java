package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IFabricantesDAO;
import com.crud.h2.dto.Fabricante;



@Service
public class FabricanteServiceImpl implements IFabricanteService {

	
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
		@Autowired
		IFabricantesDAO iFabricantesDAO;
		
	@Override
	public List<Fabricante> listarFabricantes() {
		// TODO Auto-generated method stub
		return iFabricantesDAO.findAll();
	}

	@Override
	public Fabricante guardarFabricante(Fabricante fabricante) {
		// TODO Auto-generated method stub
		return iFabricantesDAO.save(fabricante);
	}

	@Override
	public Fabricante fabricanteXID(int id) {
		// TODO Auto-generated method stub
		return iFabricantesDAO.findById(id).get();
	}

	@Override
	public List<Fabricante> listarFabricanteNombre(String nombre) {
		// TODO Auto-generated method stub
		return iFabricantesDAO.findByNombre(nombre);
	}

	@Override
	public Fabricante actualizarFabricante(Fabricante fabricante) {
		// TODO Auto-generated method stub
		return iFabricantesDAO.save(fabricante);
	}

	@Override
	public void eliminarFabricante(int id) {
		// TODO Auto-generated method stub
		iFabricantesDAO.deleteById(id);
	}

}
