package br.upe.verdinhas.catalogo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Local {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "local_id")
	private Long id;
	private String nomeLocal;
	private String descricao;
	private boolean cobertura;
	private String umidade;
	private String tipoIncidenciaSolar;
	private String tipoExposicaoSolar;
	private String tipoVento;
	private byte[] fotos;

	@OneToMany
	@JoinColumn(name = "local_id")
	private List<Verdinhas> verdinhas;

	public List<Verdinhas> getVerdinhas() {
		return verdinhas;
	}

	public void setVerdinhas(List<Verdinhas> verdinhas) {
		this.verdinhas = verdinhas;
	}

	public String getTipoIncidenciaSolar() {
		return tipoIncidenciaSolar;
	}

	public void setTipoIncidenciaSolar(String tipoIncidenciaSolar) {
		this.tipoIncidenciaSolar = tipoIncidenciaSolar;
	}

	public String getTipoExposicaoSolar() {
		return tipoExposicaoSolar;
	}

	public void setTipoExposicaoSolar(String tipoExposicaoSolar) {
		this.tipoExposicaoSolar = tipoExposicaoSolar;
	}

	public String getTipoVento() {
		return tipoVento;
	}

	public void setTipoVento(String tipoVento) {
		this.tipoVento = tipoVento;
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
