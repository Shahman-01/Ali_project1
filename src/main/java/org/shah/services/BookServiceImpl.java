package org.shah.services;

import org.shah.models.Book;
import org.shah.repos.BookRepo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookServiceImpl implements BookService {
	private final BookRepo bookRepo;

	public BookServiceImpl(BookRepo bookRepo) {
		this.bookRepo = bookRepo;
	}

	@Override
	public Book save(Book book) {
		return bookRepo.save(book);
	}

	@Override
	public void delete(int id) {
		bookRepo.deleteById(id);
	}

	@Override
	public Book get(int id) {
		return bookRepo.findById(id).orElse(null);
	}

	@Override
	public List<Book> getAll() {
		return bookRepo.findAll();
	}
}
