package in.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.myproject.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
