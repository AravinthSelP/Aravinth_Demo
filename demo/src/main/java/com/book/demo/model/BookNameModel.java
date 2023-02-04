package com.book.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookNameModel {

	@Id
	private String nameOfBook;

	
	public BookNameModel() {
	}

	public BookNameModel(String nameOfBook) {
		this.nameOfBook = nameOfBook;
	}

	public String getNameOfBook() {
		return nameOfBook;
	}

	public void setNameOfBook(String nameOfBook) {
		this.nameOfBook = nameOfBook;
	}
	
	

	
	
	

}
