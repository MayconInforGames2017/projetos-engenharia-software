package br.upe.verdinhas.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

@Entity
public class Verdinhas {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_verdinhas")
	private Long id;
	private String especie;
	private String genero;
	private String nomePopular;
	private LocalDate dataAquisicao;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_local", referencedColumnName = "id_local")
	private Local local;
	private boolean visivel;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_caracteristicas", referencedColumnName = "id_caracteristicas")
	private Caracteristicas caracteristicas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNomePopular() {
		return nomePopular;
	}

	public void setNomePopular(String nomePopular) {
		this.nomePopular = nomePopular;
	}

	public LocalDate getDataAquisicao() {
		return dataAquisicao;
	}

	public void setDataAquisicao(LocalDate dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public boolean isVisivel() {
		return visivel;
	}

	public void setVisivel(boolean visivel) {
		this.visivel = visivel;
	}

	public Caracteristicas getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(Caracteristicas caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

}
