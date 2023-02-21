package org.shah.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "person")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "FIO")
	private String FIO;

	@Column(name = "date_of_birth")
	private LocalDate dateOfBirth;

	@OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Book> books = new ArrayList<>();

}
