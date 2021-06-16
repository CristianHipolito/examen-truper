package com.examen.cris.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.cris.domain.DataPedido;
import com.examen.cris.domain.Detalle;
import com.examen.cris.service.PedidosService;

@RestController
@RequestMapping("pedidos/")
public class ControllerPedidos {
	
	@Autowired
	private PedidosService pedidosService;

	@PostMapping("newPedido")
	public ResponseEntity<String> insertPedidos(@RequestBody DataPedido data) {
		pedidosService.insert(data);
		return new ResponseEntity<>("Se ingrego pedido", HttpStatus.OK);
	}
	
	@GetMapping("getPedidos")
	public ResponseEntity<List<Detalle>> getPedidos(){
		return new ResponseEntity<List<Detalle>>(pedidosService.getPedidos(),HttpStatus.OK);
	}
	
}
 