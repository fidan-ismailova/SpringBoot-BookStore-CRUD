package az.com.fidan.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.com.fidan.bookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
