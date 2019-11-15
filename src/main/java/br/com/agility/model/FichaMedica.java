package br.com.agility.model;

import java.util.Date;

import javax.persistence.Entity;
@Entity
public class FichaMedica {

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