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
public class Turma {
	@Id
	@GeneratedValue(generator="seq_turma")
	@SequenceGenerator(name="seq_turma", sequenceName="seq_turma")
	private int id;
	private String cod;
	private String nome;
	private String turno;
	@JoinColumn
	@ManyToOne
	private Curso curso;
	@JoinColumn
	@ManyToOne
	private Sala sala;

	private Date created;
	private Date modified;
	private String created_by;
	private String modified_by;
	private int status;
}