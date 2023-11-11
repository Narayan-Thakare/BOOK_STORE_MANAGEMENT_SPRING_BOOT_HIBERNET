package com.example.demo.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name="ClientDataa")
public class ClientData {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private  String title;
	private double total; 
private Timestamp date;
	

	
	
	 @PrePersist
	   protected void onCreate() {
	        date = new Timestamp(System.currentTimeMillis());
	   }




	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}




	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}




	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}




	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}




	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}




	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}




	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}




	/**
	 * @param total the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}




	/**
	 * @return the date
	 */
	public Timestamp getDate() {
		return date;
	}




	/**
	 * @param date the date to set
	 */
	public void setDate(Timestamp date) {
		this.date = date;
	}




	public ClientData(int id, String name, String title, double total, Timestamp date) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
		this.total = total;
		this.date = date;
	}




	public ClientData() {
		super();
		// TODO Auto-generated constructor stub
	}




	@Override
	public String toString() {
		return "ClientData [id=" + id + ", name=" + name + ", title=" + title + ", total=" + total + ", date=" + date
				+ "]";
	}




	

}
