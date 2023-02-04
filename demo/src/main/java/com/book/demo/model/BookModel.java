package com.book.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name ="BOOKMODEL")
public class BookModel {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "book_id")
	private Integer bookId;
	@Column(name = "book_name")
	private String bookName;

	public BookModel()
	{
		
	}
	
	public BookModel(Integer book_id, String book_name) {
		this.bookId = book_id;
		this.bookName = book_name;
	}

	public Integer getBook_id() {
		return bookId;
	}

	public void setBook_id(Integer book_id) {
		this.bookId = book_id;
	}

	public String getBook_name() {
		return bookName;
	}

	public void setBook_name(String book_name) {
		this.bookName = book_name;
	}
	
	
	


}
