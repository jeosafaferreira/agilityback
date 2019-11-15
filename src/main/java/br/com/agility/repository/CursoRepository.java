package br.com.agility.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.agility.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer>{

}
