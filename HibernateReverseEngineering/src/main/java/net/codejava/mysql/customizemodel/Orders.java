package net.codejava.mysql.customizemodel;
// Generated 2020-3-22 12:23:42 by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Orders generated by hbm2java
 */
@Entity
@Table(name = "orders", catalog = "db_hibernate_demo")
public class Orders implements java.io.Serializable {

	private Integer orderId;
	private Customers customers;
	private String orderName;

	public Orders() {
	}

	public Orders(Customers customers, String orderName) {
		this.customers = customers;
		this.orderName = orderName;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ORDER_ID", unique = true, nullable = false)
	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CUSTOMER_ID")
	public Customers getCustomers() {
		return this.customers;
	}

	public void setCustomers(Customers customers) {
		this.customers = customers;
	}

	@Column(name = "ORDER_NAME")
	public String getOrderName() {
		return this.orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

}
