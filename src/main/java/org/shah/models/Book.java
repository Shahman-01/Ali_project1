package org.shah.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "title")
	private String title;

	@Column(name = "author")
	private String author;

	@Column(name = "year")
	private Integer year;

	@ManyToOne
	@JoinColumn(name = "person_id")
	private Person person;

}