package br.com.agility.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Entity
@Data
public class Pessoa {
	@Id
	@GeneratedValue(generator="seq_pessoa")
	@SequenceGenerator(name="seq_pessoa", sequenceName="seq_pessoa")
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
	@JoinColumn
	@ManyToOne
	private Endereco endereco;
	private Date created;
	private Date modified;
	private String created_by;
	private String modified_by;
	private int status;

}
