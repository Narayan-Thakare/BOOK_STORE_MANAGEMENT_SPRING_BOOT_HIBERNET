package com.example.demo.repo;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {
	
	List<Book> findByTitleContaining(String title);
	
    List<Book> findAllByQuantityLessThanEqual(int quantity, Sort sort);

}
