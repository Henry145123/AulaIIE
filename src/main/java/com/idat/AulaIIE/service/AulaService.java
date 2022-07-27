package com.idat.AulaIIE.service;

import java.util.List;

import com.idat.AulaIIE.model.Aula;



public interface AulaService {
	
	List<Aula> listar();
	Aula obtenerId(Integer id);
	void guardar(Aula aula);
	void eliminar(Integer id);
	void actualizar(Aula aula);
	
}
