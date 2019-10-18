package com.ss.lmshibernate.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ss.lmshibernate.dao.BookDao;
import com.ss.lmshibernate.entity.Book;

@RestController
@RequestMapping("/lms")
public class BookController {

	@Autowired
	private BookDao bookDao;
	
	@GetMapping("/books")
	public List<Book> getAllPublisher() {
	    return bookDao.findAll();
	}
	
	// Create a new Note
	@PostMapping("/books")
	public Book createNote(@Valid @RequestBody Book book) {
	    return bookDao.save(book);
	}
	
}
