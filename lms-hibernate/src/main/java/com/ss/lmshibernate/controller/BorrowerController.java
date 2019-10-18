package com.ss.lmshibernate.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ss.lmshibernate.dao.BorrowerDao;
import com.ss.lmshibernate.entity.Borrower;


@RestController
@RequestMapping("/lms")
public class BorrowerController {

	@Autowired
	private BorrowerDao borrowerDao;
	
	@GetMapping("/borrowers")
	public List<Borrower> getAllPublisher() {
	    return borrowerDao.findAll();
	}
	
	
	// Create a new Note
	@PostMapping("/borrowers")
	public Borrower createNote(@Valid @RequestBody Borrower borrower) {
	    return borrowerDao.save(borrower);
	}
}
