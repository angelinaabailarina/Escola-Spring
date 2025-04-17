package com.example.ninoca.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ninoca.entities.Aluno;
import com.example.ninoca.entities.Curso;
import com.example.ninoca.repositories.AlunoRepository;



@Service
public class AlunoService {
private final AlunoRepository alunoRepository;
	
@Autowired
	public AlunoService(AlunoRepository alunoRepository) {
		this.alunoRepository = alunoRepository;
	}
	
	public Aluno findAlunoByid(Long id) {
		Optional<Aluno> aluno = alunoRepository.findById(id);
		return aluno.orElse(null);
	}
	
	public List<Aluno> findAllAluno(){
		return alunoRepository.findAll();
	}
	
	public Aluno saveAluno(Aluno aluno) {
		return alunoRepository.save(aluno);
	}

}
