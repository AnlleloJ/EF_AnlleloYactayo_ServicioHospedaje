package com.Anllelo.Yactayo.Paz.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.Anllelo.Yactayo.Paz.dto.Reserva;

@FeignClient(name = "idat-reserva", url="localhost:8085")
public interface OpenFeignHospedaje {
	
	@GetMapping("/reserva/v1/listar")
	public List<Reserva> listarReservaSeleccionada();

}
