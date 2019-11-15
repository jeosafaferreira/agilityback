package br.com.agility.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.agility.repository.AlunoRepository;

@RestController
@RequestMapping("/Alunos")
public class AlunoController {
	
	@Autowired
	private AlunoRepository aluRep;

}
