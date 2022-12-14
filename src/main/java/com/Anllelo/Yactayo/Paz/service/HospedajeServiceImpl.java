package com.Anllelo.Yactayo.Paz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Anllelo.Yactayo.Paz.client.OpenFeignHospedaje;
import com.Anllelo.Yactayo.Paz.dto.Reserva;
import com.Anllelo.Yactayo.Paz.model.Hospedaje;
import com.Anllelo.Yactayo.Paz.repository.HospedajeRepository;



public class HospedajeServiceImpl implements HospedajeService {

	
	
	@Autowired
	private HospedajeRepository repository;
	
	@Autowired
	private OpenFeignHospedaje feign;
	
	
	
	@Override
	public List<Hospedaje> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Hospedaje ObtenerId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Hospedaje hospedaje) {
		// TODO Auto-generated method stub
		repository.save(hospedaje);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public void asignarReservaHospedaje() {
		// TODO Auto-generated method stub
		
		
		List<Reserva> listado= feign.listarReservaSeleccionada();
		
	}

}
