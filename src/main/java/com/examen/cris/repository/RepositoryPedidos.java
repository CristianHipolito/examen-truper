package com.examen.cris.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.cris.domain.Detalle;

@Repository
public interface RepositoryPedidos extends JpaRepository<Detalle, Integer>{
	

}
