package com.Anllelo.Yactayo.Paz.model;



import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class HospedajeReserva {

	
	private static final long serialVersionUID = 569854788548521L;

	@Column(name="idHospedaje", nullable = false, unique = true)
	private Integer idHospedaje;
	
	@Column(name="idReserva", nullable = false, unique = true)
	private Integer idReserva;
	
}
