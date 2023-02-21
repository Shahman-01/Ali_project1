package org.shah.controllers;

import org.shah.models.Person;
import org.shah.services.PersonServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/people")
public class MainController {

	private final PersonServiceImpl personService;

	public MainController(PersonServiceImpl personService) {
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

}










