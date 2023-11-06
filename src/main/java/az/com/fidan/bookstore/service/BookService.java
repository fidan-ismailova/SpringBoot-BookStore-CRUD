package az.com.fidan.bookstore.service;

import java.util.List;

import az.com.fidan.bookstore.entity.Book;

public interface BookService {

	Book createBook(Book book);
	
	Book getBookById(Long bookId);
	
	List<Book> getAllBooks();
	
	Book updateBook(Book book);
	
	void deleteBook(Long bookId);
}
