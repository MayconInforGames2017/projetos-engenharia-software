package br.upe.verdinhas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Local {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_local")
	private Long id;
	private String nomeLocal;
	private String descricao;
	private boolean cobertura;
	private String umidade;
	
	@OneToOne(mappedBy = "local")
	private Verdinhas verdinhas;

	public Verdinhas getVerdinhas() {
		return verdinhas;
	}

	public void setVerdinhas(Verdinhas verdinhas) {
		this.verdinhas = verdinhas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeLocal() {
		return nomeLocal;
	}

	public void setNomeLocal(String nomeLocal) {
		this.nomeLocal = nomeLocal;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isCobertura() {
		return cobertura;
	}

	public void setCobertura(boolean cobertura) {
		this.cobertura = cobertura;
	}

	public String getUmidade() {
		return umidade;
	}

	public void setUmidade(String umidade) {
		this.umidade = umidade;
	}

}