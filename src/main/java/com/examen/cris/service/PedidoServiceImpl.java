package com.examen.cris.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.cris.domain.DataPedido;
import com.examen.cris.domain.Detalle;
import com.examen.cris.domain.Pedido;
import com.examen.cris.repository.RepositoryPedidos;

@Service
public class PedidoServiceImpl implements PedidosService{
	
	@Autowired
	private RepositoryPedidos repository;

	@Override
	public void insert(DataPedido data) {
		List<Detalle> detalles;
		try {
			detalles = mapearDatosDetalle(data);
			detalles.forEach(det -> {
				repository.save(det);
			});
		} catch (ParseException e) {
			//
		}
	}
	
	
	public List<Detalle> mapearDatosDetalle(DataPedido data) throws ParseException {
		Pedido pedido = new Pedido();
		pedido.setTotal(data.getTotal());
		pedido.setDate_sale(new SimpleDateFormat("dd-MM-yyyy").parse(data.getDate_sale()));
		
		List<Detalle> listaDetalle = new ArrayList<>();
		
		for(Detalle det : data.getListDetalle()) {
			listaDetalle.add(new Detalle(det.getId(), det.getSku(), det.getAmount(), det.getPrice(), pedido));
		}

		return listaDetalle;
	}


	@Override
	public List<Detalle> getPedidos() {
		return repository.findAll();
	}

}
