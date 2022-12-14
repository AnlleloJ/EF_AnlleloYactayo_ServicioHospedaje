package com.Anllelo.Yactayo.Paz.service;

import java.util.List;

import com.Anllelo.Yactayo.Paz.model.Hospedaje;


public interface HospedajeService {
	
	List<Hospedaje> listar();
	Hospedaje ObtenerId(Integer id);	
	void guardar(Hospedaje hospedaje);
	void eliminar(Integer id);
	
	void asignarReservaHospedaje();

}
