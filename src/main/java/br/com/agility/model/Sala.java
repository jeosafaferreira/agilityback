package br.com.agility.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Sala {
   private int id;
   private String cod;
   private String nome;
   private Date created;
   private Date modified;
   private String created_by;
   private String modified_by;
   private int status;
}