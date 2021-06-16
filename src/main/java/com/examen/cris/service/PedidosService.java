package com.examen.cris.service;

import java.util.List;

import com.examen.cris.domain.DataPedido;
import com.examen.cris.domain.Detalle;

public interface PedidosService {

	public void insert(DataPedido data);
	
	public List<Detalle> getPedidos();
	
}
