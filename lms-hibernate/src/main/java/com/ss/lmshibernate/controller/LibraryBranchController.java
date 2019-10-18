package com.ss.lmshibernate.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ss.lmshibernate.dao.LibraryBranchDao;
import com.ss.lmshibernate.entity.LibraryBranch;

@RestController
@RequestMapping("/lms")
public class LibraryBranchController {

	@Autowired
	private LibraryBranchDao libraryBranchDao;
	
	@GetMapping("/libraryBranches")
	public List<LibraryBranch> getAllAuthor() {
	    return libraryBranchDao.findAll();
	}
	
	
	// Create a new Note
	@PostMapping("/libraryBranches")
	public LibraryBranch createNote(@Valid @RequestBody LibraryBranch libraryBranch) {
	    return libraryBranchDao.save(libraryBranch);
	}
}