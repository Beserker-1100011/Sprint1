//package com.abc.techstore.entity;
//
//import java.time.LocalDate;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "shippinginfo_tbl")
//public class ShippingInfo {
//
//	@Id
//	public String ShippingId;
//	public double ShippingCost;
//	public String ShippingAddress;
//	public LocalDate ShippingDate;
//	@OneToOne
//	private Order order;
//
//	public Order getOrder() {
//		return order;
//	}
//
//	public void setOrder(Order order) {
//		this.order = order;
//	}
//
//	public String getShippingId() {
//		return ShippingId;
//	}
//
//	public void setShippingId(String shippingId) {
//		ShippingId = shippingId;
//	}
//
//	public double getShippingCost() {
//		return ShippingCost;
//	}
//
//	public void setShippingCost(double shippingCost) {
//		ShippingCost = shippingCost;
//	}
//
//	public String getShippingAddress() {
//		return ShippingAddress;
//	}
//
//	public void setShippingAddress(String shippingAddress) {
//		ShippingAddress = shippingAddress;
//	}
//
//	public LocalDate getShippingDate() {
//		return ShippingDate;
//	}
//
//	public void setShippingDate(LocalDate shippingDate) {
//		ShippingDate = shippingDate;
//	}
//
//}
