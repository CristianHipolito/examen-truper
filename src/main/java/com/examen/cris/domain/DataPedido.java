package com.examen.cris.domain;

import java.util.List;

public class DataPedido {

	private Double total;
	private String date_sale;
	private List<Detalle> listDetalle;
	
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public String getDate_sale() {
		return date_sale;
	}
	public void setDate_sale(String date_sale) {
		this.date_sale = date_sale;
	}
	public List<Detalle> getListDetalle() {
		return listDetalle;
	}
	public void setListDetalle(List<Detalle> listDetalle) {
		this.listDetalle = listDetalle;
	}
	
	
	
}
