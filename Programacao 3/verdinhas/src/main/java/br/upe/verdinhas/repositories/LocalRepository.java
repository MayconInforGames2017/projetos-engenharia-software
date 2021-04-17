package br.upe.verdinhas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.upe.verdinhas.catalogo.model.Local;

@Repository
public interface LocalRepository extends CrudRepository<Local, Long>{

}
