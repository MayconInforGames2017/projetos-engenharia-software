package br.upe.verdinhas.catalogo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.upe.verdinhas.catalogo.model.Verdinhas;

@Repository
public interface VerdinhasRepository extends CrudRepository<Verdinhas, Long>{

}
