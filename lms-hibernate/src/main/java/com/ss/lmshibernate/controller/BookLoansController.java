//package com.ss.lmshibernate.controller;
//
//import java.util.List;
//import javax.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import com.ss.lmshibernate.dao.BookLoansDao;
//import com.ss.lmshibernate.entity.BookLoans;
//
//
//@RestController
//@RequestMapping("/lms")
//public class BookLoansController {
//
//	@Autowired
//	private BookLoansDao bookLoansDao;
//	
//	@GetMapping("/bookLoans")
//	public List<BookLoans> getAllPublisher() {
//	    return bookLoansDao.findAll();
//	}
//	
//	
//	// Create a new Note
//	@PostMapping("/bookLoans")
//	public BookLoans createNote(@Valid @RequestBody BookLoans bookLoans) {
//	    return bookLoansDao.save(bookLoans);
//	}
//}
