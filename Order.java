//package com.abc.techstore.entity;
//
//import java.time.LocalDate;
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "order_tbl")
//public class Order {
//	@Id
//	private String orderId;
//	private String status;
//	private LocalDate createDate;
//	@OneToMany
//	private List<OrderItems> orderItems;
//	@ManyToOne
//	private Customer customer;
//	@OneToOne
//	private ShippingInfo shippingInfo;
//
//	public ShippingInfo getShippingInfo() {
//		return shippingInfo;
//	}
//
//	public void setShippingInfo(ShippingInfo shippingInfo) {
//		this.shippingInfo = shippingInfo;
//	}
//
//	public String getOrderId() {
//		return orderId;
//	}
//
//	public void setOrderId(String orderId) {
//		this.orderId = orderId;
//	}
//
//	public String getStatus() {
//		return status;
//	}
//
//	public void setStatus(String status) {
//		this.status = status;
//	}
//
//	public LocalDate getCreateDate() {
//		return createDate;
//	}
//
//	public void setCreateDate(LocalDate createDate) {
//		this.createDate = createDate;
//	}
//
//	public List<OrderItems> getOrderItems() {
//		return orderItems;
//	}
//
//	public void setOrderItems(List<OrderItems> orderItems) {
//		this.orderItems = orderItems;
//	}
//
//	public Customer getCustomer() {
//		return customer;
//	}
//
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}
//
//}
