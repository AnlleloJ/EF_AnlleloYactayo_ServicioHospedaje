package com.Anllelo.Yactayo.Paz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Anllelo.Yactayo.Paz.model.HospedajeDetails;

@Repository
public interface HospedajeReservaRepository extends JpaRepository<HospedajeDetails, Integer>{

}
