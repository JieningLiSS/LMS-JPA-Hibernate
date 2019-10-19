//package com.ss.lmshibernate.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.ss.lmshibernate.dao.AuthorDao;
//import com.ss.lmshibernate.dao.BookDao;
//import com.ss.lmshibernate.dao.PublisherDao;
//import com.ss.lmshibernate.entity.Author;
//import com.ss.lmshibernate.entity.Book;
//import com.ss.lmshibernate.entity.Publisher;
//
//import java.util.HashSet;
//import java.util.List;
//import java.util.Optional;
//import java.util.Set;
//
//@Service
//public class BookService {
//
//    @Autowired
//    BookDao bookDao;
//
//    @Autowired
//    AuthorDao authorDao;
//    
//    @Autowired
//    PublisherDao publisherDao;
//
//    public List<Book> getAllBooks() {
//        return bookDao.findAll();
//    }
//    public Optional<Book> getBookById(Long bookId) throws Exception {
//        if (!bookDao.existsById(bookId)) {
//            throw new Exception("Book with id " + bookId + " not found");
//        }
//        return bookDao.findById(bookId);
//    }
//
//
//    public Book createBook(Long authorId,Long publisherId, Book book) throws Exception {
//        Set<Book> books = new HashSet<>();
//        Author authorTieBook = new Author();
//        Publisher publisherTieBook = new Publisher();
//
//        Optional<Author> AuthorbyId = authorDao.findById(authorId);
//        if (!AuthorbyId.isPresent()) {
//            throw new Exception("Author with id " + authorId + " does not exist");
//        }
//        
//        Optional<Publisher> PublisherById = publisherDao.findById(publisherId);
//        if (!PublisherById.isPresent()) {
//            throw new Exception("Publisher with id " + publisherId + " does not exist");
//        }
//        
//        //tie Author and publisher to Book
//        Author author = AuthorbyId.get();
//        Publisher publisher = PublisherById.get();  
//        book.setAuthor(author);
//        book.setPublisher(publisher);
//
//        Book book1 = bookDao.save(book);
//        
//        //tie Book to Author and publisher
//        books.add(book1);
//        authorTieBook.setBooks(books);
//        publisherTieBook.setBooks(books);
//        
//        return book1;
//
//    }
//	public Book updateBook(Long bookId, Book bookRequest) throws Exception {
//	
//	      Optional<Book> book = bookDao.findById(bookId);
//
//	        if (!book.isPresent()) {
//	            throw new Exception("Book with id " + bookId + " not found");
//	        }
//
//	        Book book1 = book.get();
//	        book1.setTitle(bookRequest.getTitle());
//
//	        return bookDao.save(book1);
//
//
////        Book updateBook = findBook.get();
////        updateBook.setTitle(book.getTitle());
////              
////        //tie Author and publisher to Book
////        Author author = AuthorbyId.get();
////        Publisher publisher = PublisherById.get();
////        book.setAuthor(author);
////        book.setPublisher(publisher);
////        Book updatedBook = bookDao.save(book);
////        
////        //tie Book to Author and publisher
////        Set<Book> books = new HashSet<>();
////        books.add(updatedBook);
////        Author authorTieBook = new Author();
////        Publisher publisherTieBook = new Publisher();
////        authorTieBook.setBooks(books);
////        publisherTieBook.setBooks(books);
////
////        
////        return updatedBook;
//
//	}
//	public void deleteBook(Long bookId, Book book) throws Exception {
//		// TODO Auto-generated method stub
//		  if (!bookDao.existsById(bookId) ) {
//	            throw new Exception("Book with id " + bookId + " not found");
//	        }else {
//	        	  bookDao.deleteById(bookId);
//	        }
//	}
//}