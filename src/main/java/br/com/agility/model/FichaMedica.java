package br.com.agility.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Entity
@Data
public class FichaMedica {
	@Id
	@GeneratedValue(generator="seq_fichamed")
	@SequenceGenerator(name="seq_fichamed", sequenceName="seq_fichamed")
	private int id;
	private String tipoSanguineo;
	private String alergias;
	private String medicamentos;
	private String infoExtra;
	private Date created;
	private String created_by;
	private Date modified;
	private String modified_by;
	private int status;
}