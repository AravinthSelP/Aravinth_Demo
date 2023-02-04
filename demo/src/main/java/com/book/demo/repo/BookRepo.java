package com.book.demo.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.book.demo.model.BookModel;

@Repository
public class BookRepo {
	
	@Autowired
	JdbcTemplate jdbctemplate;
	
	public static final String retrieveBookName= "select book_name from bookmodel";
	
	public static final String updateBookName= "update bookmodel set BOOK_NAME = ? where BOOK_ID = ?";
	
	public static final String storeBook= "insert into bookmodel(BOOK_ID,BOOK_NAME) values(?,?)";
	
	public static final String deleteWithBookName = "delete FROM bookmodel where  BOOK_NAME = ?";
	
	public static final String retrieveBookWithId= "select book_name from bookmodel where BOOK_ID = ?";
	
	public List<String> retriveBookName()
	{
		List<String> bookNameList  = new ArrayList<>();
		bookNameList.addAll(jdbctemplate.queryForList(retrieveBookName, String.class));
		return bookNameList;
	}
	
	public String updateWithBookName(BookModel model)
	{
		jdbctemplate.update(updateBookName,model.getBook_name(),model.getBook_id());
		 return "Done";
	}
	
	public String storeBook(BookModel model)
	{
		jdbctemplate.update(storeBook,model.getBook_id(),model.getBook_name());
		return "done";
	}

	public void deleteWithBookName(String bookName) {
		
		jdbctemplate.update(deleteWithBookName,bookName);
		
	}

	@SuppressWarnings("deprecation")
	public String retrieveBookWithId(Integer id) {
		 String bookName = (String) jdbctemplate.queryForObject(
				 retrieveBookWithId, new Object[] { id }, String.class);
		return bookName;
	}

	
}
