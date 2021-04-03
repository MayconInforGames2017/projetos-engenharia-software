package br.upe.verdinhas.repositories;

import org.springframework.data.repository.Repository;

import br.upe.verdinhas.model.Verdinhas;

public interface VerdinhasRepository <T, ID> extends Repository<Verdinhas, Long>{

}
