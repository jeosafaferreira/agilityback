package br.com.agility.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.agility.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer>{

}
