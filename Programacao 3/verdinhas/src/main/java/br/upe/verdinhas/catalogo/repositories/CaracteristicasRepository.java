package br.upe.verdinhas.catalogo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.upe.verdinhas.catalogo.model.Caracteristicas;

@Repository
public interface CaracteristicasRepository extends CrudRepository<Caracteristicas, Long> {

	List<Caracteristicas> findByFlores(String flores);
	
	List<Caracteristicas> findByCorFlores(String cor_flores);
	
	List<Caracteristicas> findByCorFolhagem(String cor_folhagem);
	
	List<Caracteristicas> findByFolhagem(String folhagem);
	
	List<Caracteristicas> findByFrutos(String cor_frutos);
	
	List<Caracteristicas> findByRaizes(String raizes);

	List<Caracteristicas> findByArbustos(String arbustos);

}
