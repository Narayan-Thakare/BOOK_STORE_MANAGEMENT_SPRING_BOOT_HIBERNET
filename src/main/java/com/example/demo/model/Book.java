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
@Table(name="Bookss")
public class Book {

	

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
	private  int quantity;
	private int rate ;
	private double total;
	private String title;
	private String author;
	private String language;
	private String number_of_pages;
	private String genre;
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
	 * @return the rate
	 */
	public int getRate() {
		return rate;
	}



	/**
	 * @param rate the rate to set
	 */
	public void setRate(int rate) {
		this.rate = rate;
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
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}



	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
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
	 * @return the number_of_pages
	 */
	public String getNumber_of_pages() {
		return number_of_pages;
	}



	/**
	 * @param number_of_pages the number_of_pages to set
	 */
	public void setNumber_of_pages(String number_of_pages) {
		this.number_of_pages = number_of_pages;
	}



	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}



	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
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



	public Book(int id, int quantity, int rate, double total, String title, String author, String language,
			String number_of_pages, String genre, Timestamp date) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.rate = rate;
		this.total = total;
		this.title = title;
		this.author = author;
		this.language = language;
		this.number_of_pages = number_of_pages;
		this.genre = genre;
		this.date = date;
	}



	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}



	



	
	
	
	
}
