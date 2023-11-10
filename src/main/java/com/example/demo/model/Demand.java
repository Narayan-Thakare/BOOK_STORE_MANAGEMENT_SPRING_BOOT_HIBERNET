package com.example.demo.model;

import java.sql.Timestamp;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;



@Entity
@Table(name="Demand")
public class Demand {

	

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
	private  int quantity;
	
	private String title;
	private String language;

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
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}



	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
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
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}



	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
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



	public Demand(int id, int quantity, String title, String language, Timestamp date) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.title = title;
		this.language = language;
		this.date = date;
	}



	public Demand() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Demand [id=" + id + ", quantity=" + quantity + ", title=" + title + ", language=" + language + ", date="
				+ date + "]";
	}




	



	
	
	
	
}
