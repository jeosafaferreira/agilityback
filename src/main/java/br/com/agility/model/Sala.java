package br.com.agility.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Entity
@Data
public class Sala {

	@Id
	@GeneratedValue(generator="seq_sala")
	@SequenceGenerator(name="seq_sala", sequenceName="seq_sala")
	private int id;
	private String cod;
	private String nome;
	private Date created;
	private Date modified;
	private String created_by;
	private String modified_by;
	private int status;
}