package com.Anllelo.Yactayo.Paz.model;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Hospedaje_Reserva")
public class HospedajeDetails {
	
	
	
	@Id
	private HospedajeReserva fk= new HospedajeReserva();
	
	
	

}
