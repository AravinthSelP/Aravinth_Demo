package com.book.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.book.demo.model.BookModel;
import com.book.demo.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;

	@RequestMapping(value ="/book/StoreBook", method = RequestMethod.POST)
	public BookModel storeBook(@RequestBody BookModel model)
	{
		return bookService.storeBook(model);
	}
	
	@RequestMapping(value ="/book/retrieveBookNames")
	public List<String> getBookNames()
	{
		return bookService.retrieveBooks();
	}
	
	@RequestMapping(value ="/book/{id}",method = RequestMethod.GET)
	public String retrieveBookWithId(@PathVariable Integer id)
	{
		return bookService.retrieveBookWithId(id);
	}
	
	@RequestMapping(value ="/book/deleteWithBookName", method = RequestMethod.POST)
	public String deleteWithBookName(@RequestBody BookModel request)
	{
		return bookService.deleteWithBookName(request.getBook_name());
	}
	
	@RequestMapping(value ="/book/updateWithBookName", method = RequestMethod.POST)
	public String updateWithBookName(@RequestBody BookModel model)
	{
		return bookService.updateWithBookName(model);
	}
}
