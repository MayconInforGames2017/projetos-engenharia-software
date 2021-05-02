package br.upe.verdinhas.insumos.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.upe.verdinhas.manutencao.enums.TipoAdubo;

@Entity
public class Adubo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "adubo_id")
	private Long id;

	private String nome_adubo;
	private String composicao_adubo;
	private String quantidade_adubo;
	private String observacao_adubo;
	private byte[] fotos_adubo;

	@Enumerated(EnumType.STRING)
	private TipoAdubo tipoAdubo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome_adubo() {
		return nome_adubo;
	}

	public void setNome_adubo(String nome_adubo) {
		this.nome_adubo = nome_adubo;
	}

	public String getComposicao_adubo() {
		return composicao_adubo;
	}

	public void setComposicao_adubo(String composicao_adubo) {
		this.composicao_adubo = composicao_adubo;
	}

	public String getQuantidade_adubo() {
		return quantidade_adubo;
	}

	public void setQuantidade_adubo(String quantidade_adubo) {
		this.quantidade_adubo = quantidade_adubo;
	}

	public String getObservacao_adubo() {
		return observacao_adubo;
	}

	public void setObservacao_adubo(String observacao_adubo) {
		this.observacao_adubo = observacao_adubo;
	}

	public byte[] getFotos_adubo() {
		return fotos_adubo;
	}

	public void setFotos_adubo(byte[] fotos_adubo) {
		this.fotos_adubo = fotos_adubo;
	}

	public TipoAdubo getTipoAdubo() {
		return tipoAdubo;
	}

	public void setTipoAdubo(TipoAdubo tipoAdubo) {
		this.tipoAdubo = tipoAdubo;
	}

}
