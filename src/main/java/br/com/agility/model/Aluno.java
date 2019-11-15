package br.com.agility.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Aluno {

	private int id;
	private Pessoa pessoa;
	private Pessoa responsavel;
	private FichaMedica fichaMedica;
	private Endereco endereco;
	private Turma turma;
	private Date created;
	private Date modified;
	private String created_by;
	private String modified_by;
	private int status;
}
