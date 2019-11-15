package br.com.agility.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Entity
@Data
public class Curso {
	@Id
	@GeneratedValue(generator="seq_curso")
	@SequenceGenerator(name="seq_curso", sequenceName="seq_curso")
	private int id;
	private String cod;
	private String nome;
	private Double precoBase;
	private Double frequenciaMinima;
	private Date created;
	private Date modified;
	private String created_by;
	private String modified_by;
	private int status;
}