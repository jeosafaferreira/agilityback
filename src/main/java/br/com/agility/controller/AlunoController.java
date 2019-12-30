package br.com.agility.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.agility.model.Aluno;
import br.com.agility.repository.AlunoRepository;
import br.com.agility.repository.FichaMedicaRepository;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoRepository aluRep;
	@Autowired
	private FichaMedicaRepository medRep;
	
	@PostMapping
	public String inserir(@RequestBody Aluno aluno) {
		aluRep.save(aluno);
		return "ok";
		
	}
	
	@GetMapping
	public List<Aluno> buscarTodos(){
		return aluRep.findAll();
	}

}