package PBD;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

import java.sql.Timestamp;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;

/**
 * Definition of class
 */
@PersistenceCapable
public class Ticket {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.NATIVE)
	private long id;
	private Timestamp created_at;
	private int status;
	private String currency;
	private int quantity;
	private double price;

	// @Persistent(mappedBy="Tickerlistener")
	// private Listener listener;

	public Ticket(int status, int q, double price, Listener l) {
		this.status = status;
		this.quantity = q;
		this.price = price;
		// listener=l;

	}

	public void changeStatus() {
		// TODO - implement Ticket.changeStatus
		throw new UnsupportedOperationException();
	}

	private Conference conference;

	public Timestamp getCreated_at() {
		return this.created_at;
	}

	/**
	 * @param created_at
	 */
	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}

	public int getStatus() {
		return this.status;
	}

	/**
	 * @param status
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	public String getCurrency() {
		return this.currency;
	}

	/**
	 * @param currency
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return this.price;
	}

	/**
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

}
