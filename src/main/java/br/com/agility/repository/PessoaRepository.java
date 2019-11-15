package br.com.agility.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.agility.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
