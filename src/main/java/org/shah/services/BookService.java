package org.shah.services;

import org.shah.models.Book;
import org.shah.models.Person;

import java.util.List;

public interface BookService {
	Book save(Book book);

	void delete(int id);

	Book get(int id);

	List<Book> getAll();
}
