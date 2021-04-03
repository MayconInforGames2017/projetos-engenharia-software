package br.upe.verdinhas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Caracteristicas {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_caracteristicas")
	private long id;
	private String folhagem;
	private String corFolhagem;
	private String arbustos;
	private String flore;
	private String corFlores;
	private String frutos;
	private String raizes;
	
	public Verdinhas getVerdinhas() {
		return verdinhas;
	}

	public void setVerdinhas(Verdinhas verdinhas) {
		this.verdinhas = verdinhas;
	}

	@OneToOne(mappedBy = "caracteristicas")
	private Verdinhas verdinhas;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFolhagem() {
		return folhagem;
	}

	public void setFolhagem(String folhagem) {
		this.folhagem = folhagem;
	}

	public String getCorFolhagem() {
		return corFolhagem;
	}

	public void setCorFolhagem(String corFolhagem) {
		this.corFolhagem = corFolhagem;
	}

	public String getArbustos() {
		return arbustos;
	}

	public void setArbustos(String arbustos) {
		this.arbustos = arbustos;
	}

	public String getFlore() {
		return flore;
	}

	public void setFlore(String flore) {
		this.flore = flore;
	}

	public String getCorFlores() {
		return corFlores;
	}

	public void setCorFlores(String corFlores) {
		this.corFlores = corFlores;
	}

	public String getFrutos() {
		return frutos;
	}

	public void setFrutos(String frutos) {
		this.frutos = frutos;
	}

	public String getRaizes() {
		return raizes;
	}

	public void setRaizes(String raizes) {
		this.raizes = raizes;
	}

}