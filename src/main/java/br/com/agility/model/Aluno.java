package br.com.agility.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Entity
@Data
public class Aluno {
	@Id
	@GeneratedValue(generator="seq_aluno")
	@SequenceGenerator(name="seq_aluno", sequenceName="seq_aluno")
	private int id;
	@JoinColumn
	@OneToOne
	private Pessoa pessoa;
	@JoinColumn
	@ManyToOne
	private Pessoa responsavel;
	@JoinColumn
	@OneToOne
	private FichaMedica fichaMedica;
	@JoinColumn
	@ManyToOne
	private Turma turma;
	private Date created;
	private Date modified;
	private String created_by;
	private String modified_by;
	private int status;
}
