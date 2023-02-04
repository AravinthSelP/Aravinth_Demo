package com.book.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.demo.model.BookModel;
import com.book.demo.repo.BookRepo;

@Service
public class BookService {
	
	@Autowired
	private BookRepo bookRepo;
	
	public BookModel storeBook(BookModel model)
	{
		bookRepo.storeBook(model);
		return model;
	}
	
	public List<String> retrieveBooks()
	{
		return  bookRepo.retriveBookName();
	}
	
	public String retrieveBookWithId(Integer id)
	{	
		return bookRepo.retrieveBookWithId(id);
	}

	public String deleteWithBookName(String bookName)
	{
		bookRepo.deleteWithBookName(bookName);
		return "Sucessfully Deleted";
	}
	
	public String updateWithBookName(BookModel model)
	{
		return bookRepo.updateWithBookName(model);
	}
}
