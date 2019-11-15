package br.com.agility.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Entity
@Data
public class Endereco {
	@Id
	@GeneratedValue(generator="seq_endereco")
	@SequenceGenerator(name="seq_endereco", sequenceName="seq_endereco")
	private int id;
	private String cep;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String municipio;
	private String referencia;
	private String uf;
	private Date created;
	private Date modified;
	private String created_by;
	private String modified_by;
	private int status;
}