package com.generationBoaAcaoAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generationBoaAcaoAPI.model.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long> {
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);	
}