package br.com.agility.model;

import java.util.Date;

import javax.persistence.Entity;
@Entity
public class Endereco {

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