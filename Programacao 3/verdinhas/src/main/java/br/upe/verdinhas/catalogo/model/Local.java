package br.upe.verdinhas.catalogo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.upe.verdinhas.catalogo.enums.TipoExposicaoSolar;
import br.upe.verdinhas.catalogo.enums.TipoIncidenciaSolar;
import br.upe.verdinhas.catalogo.enums.TipoVento;

@Entity
public class Local implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_local")
	private Long id;

	private String nomeLocal;
	private String descricao;
	private boolean cobertura;
	private String umidade;

	@OneToMany(mappedBy = "local")
	private List<Verdinhas> verdinhas;

	@Enumerated(EnumType.STRING)
	private TipoIncidenciaSolar tipoIncidenciaSolar;

	@Enumerated(EnumType.STRING)
	private TipoExposicaoSolar tipoExposicaoSolar;

	@Enumerated(EnumType.STRING)
	private TipoVento tipoVento;

	private byte[] fotos;

	public List<Verdinhas> getVerdinhas() {
		return verdinhas;
	}

	public void setVerdinhas(List<Verdinhas> verdinhas) {
		this.verdinhas = verdinhas;
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

	public TipoIncidenciaSolar getTipoIncidenciaSolar() {
		return tipoIncidenciaSolar;
	}

	public void setTipoIncidenciaSolar(TipoIncidenciaSolar tipoIncidenciaSolar) {
		this.tipoIncidenciaSolar = tipoIncidenciaSolar;
	}

	public TipoExposicaoSolar getTipoExposicaoSolar() {
		return tipoExposicaoSolar;
	}

	public void setTipoExposicaoSolar(TipoExposicaoSolar tipoExposicaoSolar) {
		this.tipoExposicaoSolar = tipoExposicaoSolar;
	}

	public TipoVento getTipoVento() {
		return tipoVento;
	}

	public void setTipoVento(TipoVento tipoVento) {
		this.tipoVento = tipoVento;
	}

}
