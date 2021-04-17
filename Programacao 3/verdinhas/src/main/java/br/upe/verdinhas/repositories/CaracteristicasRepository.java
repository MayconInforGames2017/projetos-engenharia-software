package br.upe.verdinhas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.upe.verdinhas.catalogo.model.Caracteristicas;

@Repository
public interface CaracteristicasRepository extends CrudRepository<Caracteristicas, Long> {

}
