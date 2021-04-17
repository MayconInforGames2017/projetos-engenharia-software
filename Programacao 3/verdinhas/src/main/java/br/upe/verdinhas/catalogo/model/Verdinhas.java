package br.upe.verdinhas.catalogo.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class Verdinhas implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "verdinhas_id")
	private Long id;

	private String nome;
	private String especie;
	private String genero;
	private String nomePopular;

	@Transient
	private LocalDate dataAquisicao = LocalDate.now();

	private byte[] fotos;

	private boolean visivel;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_local")
	private Local local;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_caracteristicas")
	private Caracteristicas caracteristicas;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_necessidades")
	private Necessidades necessidades;

	public Necessidades getNecessidades() {
		return necessidades;
	}

	public void setNecessidades(Necessidades necessidades) {
		this.necessidades = necessidades;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public byte[] getFotos() {
		return fotos;
	}

	public void setFotos(byte[] fotos) {
		this.fotos = fotos;
	}

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
