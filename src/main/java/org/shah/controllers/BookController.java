package org.shah.controllers;

import org.shah.models.Book;
import org.shah.services.BookServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
	private final BookServiceImpl service;

	public BookController(BookServiceImpl service) {
		this.service = service;
	}

	@GetMapping
	public ResponseEntity<List<Book>> getAllBooks() {
		List<Book> list = service.getAll();

		if (list.isEmpty())
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);

		return new ResponseEntity<>(list, HttpStatus.OK);
	}
}
