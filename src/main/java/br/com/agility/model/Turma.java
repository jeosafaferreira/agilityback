package br.com.agility.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Turma {
   private int id;
   private String cod;
   private String nome;
   private String turno;
   private Curso curso;
   private Sala sala;
   private Date created;
   private Date modified;
   private String created_by;
   private String modified_by;
   private int status;
}