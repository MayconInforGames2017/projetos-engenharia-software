package br.upe.verdinhas.catalogo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.upe.verdinhas.catalogo.model.Local;

@Repository
public interface LocalRepository extends CrudRepository<Local, Long>{

	List<Local> findByNomeLocal(String nome_local);
	
	List<Local> findByDescricao(String descricao);
	
	List<Local> findByUmidade(String umidade);
	
	List<Local> findByCobertura(boolean cobertura);
	
}
