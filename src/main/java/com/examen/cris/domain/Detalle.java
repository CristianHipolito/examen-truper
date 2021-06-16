package com.examen.cris.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="pedidos_detalle_w")
public class Detalle {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_PEDIDO", referencedColumnName = "id")
	private Pedido pedido;
	private String sku;
	private Double amount;
	private Double price;
	
	public Detalle() {}
	
	public Detalle(Integer id, String sku, Double amount, Double price, Pedido pedido) {
		super();
		this.id = id;
		this.sku = sku;
		this.amount = amount;
		this.price = price;
		this.pedido = pedido;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Detalle [id=" + id + ", sku=" + sku + ", amount=" + amount + ", price="
				+ price + "]";
	}
	
}
