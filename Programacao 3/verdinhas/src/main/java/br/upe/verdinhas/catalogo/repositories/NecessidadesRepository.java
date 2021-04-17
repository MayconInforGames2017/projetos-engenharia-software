package br.upe.verdinhas.catalogo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.upe.verdinhas.catalogo.model.Necessidades;

@Repository
public interface NecessidadesRepository extends CrudRepository<Necessidades, Long>{

}
