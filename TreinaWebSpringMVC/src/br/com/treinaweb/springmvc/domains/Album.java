package br.com.treinaweb.springmvc.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "alb_albums")
public class Album {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "alb_id")
	private Long id;

	// annotations were used to restrict the data on the forms
	@NotNull(message = "O nome é OBRIGATÓRIO!!")
	@NotEmpty(message = "O nome é OBRIGATÓRIO!!")
	@Size(min = 4, max = 10, message = "O nome deve Conter entre 4 e 10 Caracteres!!")
	@Column(name = "alb_name", length = 10, nullable = false)
	private String name;

	@NotNull(message = "O ano de lançamento é OBRIGATÓRIO!!")
	@Min(value = 1700, message = "O Ano de lançamento deve ser a partir de 1700 !!")
	@Max(value = 2050, message = "O Ano de lançamento deve ser até 2050 !!")
	@Column(name = "alb_release_year", nullable = false)
	private int releaseYear;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

}
