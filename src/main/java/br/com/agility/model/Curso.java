package br.com.agility.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Curso {
	@Id
	@GeneratedValue(generator = "seq_curso")
	@SequenceGenerator(name = "seq_curso", sequenceName = "seq_curso")
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

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPrecoBase() {
		return precoBase;
	}

	public void setPrecoBase(Double precoBase) {
		this.precoBase = precoBase;
	}

	public Double getFrequenciaMinima() {
		return frequenciaMinima;
	}

	public void setFrequenciaMinima(Double frequenciaMinima) {
		this.frequenciaMinima = frequenciaMinima;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getModified_by() {
		return modified_by;
	}

	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}