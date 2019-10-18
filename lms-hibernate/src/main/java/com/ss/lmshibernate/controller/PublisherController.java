package com.ss.lmshibernate.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ss.lmshibernate.dao.PublisherDao;
import com.ss.lmshibernate.entity.Publisher;


@RestController
@RequestMapping("/lms")
public class PublisherController {

	@Autowired
	private PublisherDao publisherDao;
	
	@GetMapping("/publishers")
	public List<Publisher> getAllPublisher() {
	    return publisherDao.findAll();
	}
	
	
	// Create a new Note
	@PostMapping("/publishers")
	public Publisher createNote(@Valid @RequestBody Publisher publisher) {
	    return publisherDao.save(publisher);
	}
}
