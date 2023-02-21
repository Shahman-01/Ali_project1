package org.shah.services;

import org.shah.models.Person;

import java.util.List;

public interface PersonService {
	// null if updated Person does not belong to userId
	Person save(Person Person);

	// false if Person does not belong to userId
	void delete(int id);

	// null if Person does not belong to userId
	Person get(int id);

	// ORDERED dateTime desc
	List<Person> getAll();
}
