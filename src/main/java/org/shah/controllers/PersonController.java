package org.shah.controllers;

import org.shah.models.Person;
import org.shah.services.PersonServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PersonController {

	private final PersonServiceImpl personService;

	public PersonController(PersonServiceImpl personService) {
		this.personService = personService;
	}

	@GetMapping()
	public ResponseEntity<List<Person>> getAll() {
		List<Person> list = personService.getAll();

		if (list.isEmpty())
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Person> getPerson(@PathVariable("id") int id) {
		Person person = personService.get(id);

		if (person == null)
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(person, HttpStatus.OK);
	}

	@PostMapping()
	public ResponseEntity<Person> savePerson(@RequestBody Person person) {
		if (person == null)
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

		personService.save(person);
		return new ResponseEntity<>(person, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Person> updatePerson(@RequestBody Person person) {
		if (person == null)
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

		personService.save(person);
		return new ResponseEntity<>(person, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Person> deletePerson(@PathVariable("id") int id) {
		Person person = personService.get(id);

		if (person == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		personService.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}










