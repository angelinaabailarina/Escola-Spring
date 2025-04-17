package com.example.ninoca.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.ninoca.entities.Curso;
import com.example.ninoca.repositories.CursoRepository;

@Service
public class CursoService {
	private final CursoRepository cursoRepository;
	
	public CursoService(CursoRepository cursoRepository) {
		this.cursoRepository = cursoRepository;
	}
	
	public Curso findCursoByid(Long id) {
		Optional<Curso> curso = cursoRepository.findById(id);
		return curso.orElse(null);
	}
	
	public List<Curso> findAllCursos(){
		return cursoRepository.findAll();
	}
	
	public Curso saveCursos(Curso curso) {
		return cursoRepository.save(curso);
	}

}
