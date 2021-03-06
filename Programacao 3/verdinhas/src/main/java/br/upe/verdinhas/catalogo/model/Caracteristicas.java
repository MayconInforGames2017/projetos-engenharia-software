package br.upe.verdinhas.catalogo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.upe.verdinhas.catalogo.enums.TipoPropagacao;

@Entity
public class Caracteristicas implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_caracteristicas")
	private long id;
	
	private String folhagem;
	private String corFolhagem;
	private String arbustos;
	private String flores;
	private String corFlores;
	private String frutos;
	private String raizes;

	@Enumerated(EnumType.STRING)
	TipoPropagacao tipo;

	@OneToOne(mappedBy = "caracteristicas")
	private Verdinhas verdinhas;

	public Verdinhas getVerdinhas() {
		return verdinhas;
	}

	public void setVerdinhas(Verdinhas verdinhas) {
		this.verdinhas = verdinhas;
	}

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

	public String getFlores() {
		return flores;
	}

	public void setFlores(String flores) {
		this.flores = flores;
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
