package org.shah.services;

import org.shah.models.Person;
import org.shah.repos.PersonRepo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class PersonServiceImpl implements PersonService {
	private final PersonRepo personRepo;

	public PersonServiceImpl(PersonRepo personRepo) {
		this.personRepo = personRepo;
	}

	public Person save(Person person) {
		return personRepo.save(person);
	}

	@Override
	public void delete(int id) {
		personRepo.deleteById(id);
	}

	@Override
	public Person get(int id) {
		return personRepo.findById(id).orElse(null);
	}

	@Override
	public List<Person> getAll() {
		return personRepo.findAll();
	}
}
