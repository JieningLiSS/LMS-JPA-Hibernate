//package com.ss.lmshibernate.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import com.ss.lmshibernate.dao.AuthorDao;
//import com.ss.lmshibernate.entity.Author;
//
//@Service
//public class AuthorService {
//	 @Autowired
//    AuthorDao authorDao;
//
//    public List<Author> getAuthors() {
//        return authorDao.findAll();
//    }
//
//    public Author createAuthor(Author author) {
//        return authorDao.save(author);
//    }
//
//	public Author updateAuthor(Long authorId, Author author) throws Exception{
//		// TODO Auto-generated method stub 
//		
//		  if (!authorDao.existsById(authorId)) {
//	            throw new Exception("Author with id " + authorId + " not found");
//	        }
//		  author.setAuthorId(authorId);
//		  return authorDao.save(author);
//	}
//
//	public void deleteAuthor(Long authorId,Author author) throws Exception {
//		// TODO Auto-generated method stub
//	
//		  if (!authorDao.existsById(authorId)) {
//	            throw new Exception("Author with id " + authorId + " not found");
//	        }else {
//	        	 authorDao.deleteById(authorId);
//	        }	  
//	}
//
//}
