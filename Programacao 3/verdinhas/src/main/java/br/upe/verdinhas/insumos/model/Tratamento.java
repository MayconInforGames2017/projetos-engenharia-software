package br.upe.verdinhas.insumos.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.upe.verdinhas.manutencao.enums.TipoPatologia;

@Entity
public class Tratamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tratamento_id")
	private Long id;

	private String nome_tratamento;
	private String composicao_tratamento;
	private String observacao_tratamento;
	private String quantidade_tratamento;

	private byte[] fotos_tratamento;

	@Enumerated(EnumType.STRING)
	private TipoPatologia tipoPatologia;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome_tratamento() {
		return nome_tratamento;
	}

	public void setNome_tratamento(String nome_tratamento) {
		this.nome_tratamento = nome_tratamento;
	}

	public String getComposicao_tratamento() {
		return composicao_tratamento;
	}

	public void setComposicao_tratamento(String composicao_tratamento) {
		this.composicao_tratamento = composicao_tratamento;
	}

	public String getObservacao_tratamento() {
		return observacao_tratamento;
	}

	public void setObservacao_tratamento(String observacao_tratamento) {
		this.observacao_tratamento = observacao_tratamento;
	}

	public String getQuantidade_tratamento() {
		return quantidade_tratamento;
	}

	public void setQuantidade_tratamento(String quantidade_tratamento) {
		this.quantidade_tratamento = quantidade_tratamento;
	}

	public byte[] getFotos_tratamento() {
		return fotos_tratamento;
	}

	public void setFotos_tratamento(byte[] fotos_tratamento) {
		this.fotos_tratamento = fotos_tratamento;
	}

	public TipoPatologia getTipoPatologia() {
		return tipoPatologia;
	}

	public void setTipoPatologia(TipoPatologia tipoPatologia) {
		this.tipoPatologia = tipoPatologia;
	}

}
