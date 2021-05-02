package br.upe.verdinhas.insumos.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.upe.verdinhas.catalogo.enums.TipoSubstrato;

@Entity
public class Substrato implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "substrato_id")
	private String nome_substrato;
	private String composicao_substrato;
	private String observacao_substrato;
	private Integer quantidade_substrato;

	private byte[] fotos_substrato;

	@Enumerated(EnumType.STRING)
	private TipoSubstrato tipoSubstrato;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome_substrato() {
		return nome_substrato;
	}

	public void setNome_substrato(String nome_substrato) {
		this.nome_substrato = nome_substrato;
	}

	public String getComposicao_substrato() {
		return composicao_substrato;
	}

	public void setComposicao_substrato(String composicao_substrato) {
		this.composicao_substrato = composicao_substrato;
	}

	public String getObservacao_substrato() {
		return observacao_substrato;
	}

	public void setObservacao_substrato(String observacao_substrato) {
		this.observacao_substrato = observacao_substrato;
	}

	public Integer getQuantidade_substrato() {
		return quantidade_substrato;
	}

	public void setQuantidade_substrato(Integer quantidade_substrato) {
		this.quantidade_substrato = quantidade_substrato;
	}

	public byte[] getFotos_substrato() {
		return fotos_substrato;
	}

	public void setFotos_substrato(byte[] fotos_substrato) {
		this.fotos_substrato = fotos_substrato;
	}

	public TipoSubstrato getTipoSubstrato() {
		return tipoSubstrato;
	}

	public void setTipoSubstrato(TipoSubstrato tipoSubstrato) {
		this.tipoSubstrato = tipoSubstrato;
	}

}
