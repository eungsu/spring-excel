package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Book;
import com.example.repository.BookRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BookService {

	private final BookRepository bookRepository;
	
	public void saveBook(Book book) {
		bookRepository.save(book);
	}
	
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}
	
	public Book getBook(long id) {
		return bookRepository.getById(id);
	}
	
}
