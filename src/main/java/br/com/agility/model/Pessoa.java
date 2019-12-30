package br.com.agility.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Date getDataRg() {
		return dataRg;
	}
	public void setDataRg(Date dataRg) {
		this.dataRg = dataRg;
	}
	public String getOrgaoRg() {
		return orgaoRg;
	}
	public void setOrgaoRg(String orgaoRg) {
		this.orgaoRg = orgaoRg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEstCivil() {
		return estCivil;
	}
	public void setEstCivil(String estCivil) {
		this.estCivil = estCivil;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getTel1() {
		return tel1;
	}
	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}
	public String getTel2() {
		return tel2;
	}
	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
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
