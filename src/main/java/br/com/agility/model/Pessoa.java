package br.com.agility.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Pessoa {

	private int id;
	private String nome;
	private Date dataNasc;
	private String cpf;
	private String rg;
	private Date dataRg;
	private String orgaoRg;
	private String email;
	private String estCivil;
	private String sexo;
	private String tel1;
	private String tel2;
	private Date created;
	private Date modified;
	private String created_by;
	private String modified_by;
	private int status;

}
