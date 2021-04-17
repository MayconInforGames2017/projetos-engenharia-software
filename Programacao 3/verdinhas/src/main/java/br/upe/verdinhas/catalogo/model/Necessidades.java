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

import br.upe.verdinhas.catalogo.enums.TipoExposicaoSolar;
import br.upe.verdinhas.catalogo.enums.TipoFrequencia;
import br.upe.verdinhas.catalogo.enums.TipoIncidenciaSolar;
import br.upe.verdinhas.catalogo.enums.TipoPodaLimpeza;
import br.upe.verdinhas.catalogo.enums.TipoRega;
import br.upe.verdinhas.catalogo.enums.TipoSubstrato;
import br.upe.verdinhas.catalogo.enums.TipoVaso;
import br.upe.verdinhas.catalogo.enums.TipoVento;

@Entity
public class Necessidades implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_necessidades")
	private Long id;

	@OneToOne(mappedBy = "necessidades")
	private Verdinhas verdinhas;

	@Enumerated(EnumType.STRING)
	private TipoVaso tipoVaso;

	@Enumerated(EnumType.STRING)
	private TipoIncidenciaSolar tipoIncidenciaSolar;

	@Enumerated(EnumType.STRING)
	private TipoExposicaoSolar tipoExposicaoSolar;

	@Enumerated(EnumType.STRING)
	private TipoRega tipoRega;

	@Enumerated(EnumType.STRING)
	private TipoFrequencia tipoFrequencia;

	@Enumerated(EnumType.STRING)
	private TipoVento tipoVento;

	@Enumerated(EnumType.STRING)
	private TipoSubstrato tipoSubstrato;

	@Enumerated(EnumType.STRING)
	private TipoPodaLimpeza tipoPodaLimpeza;

	@Enumerated(EnumType.STRING)
	private TipoFrequencia tipoFrequenciaPoda;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Verdinhas getVerdinhas() {
		return verdinhas;
	}

	public void setVerdinhas(Verdinhas verdinhas) {
		this.verdinhas = verdinhas;
	}

	public TipoVaso getTipoVaso() {
		return tipoVaso;
	}

	public void setTipoVaso(TipoVaso tipoVaso) {
		this.tipoVaso = tipoVaso;
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

	public TipoRega getTipoRega() {
		return tipoRega;
	}

	public void setTipoRega(TipoRega tipoRega) {
		this.tipoRega = tipoRega;
	}

	public TipoFrequencia getTipoFrequencia() {
		return tipoFrequencia;
	}

	public void setTipoFrequencia(TipoFrequencia tipoFrequencia) {
		this.tipoFrequencia = tipoFrequencia;
	}

	public TipoVento getTipoVento() {
		return tipoVento;
	}

	public void setTipoVento(TipoVento tipoVento) {
		this.tipoVento = tipoVento;
	}

	public TipoSubstrato getTipoSubstrato() {
		return tipoSubstrato;
	}

	public void setTipoSubstrato(TipoSubstrato tipoSubstrato) {
		this.tipoSubstrato = tipoSubstrato;
	}

	public TipoPodaLimpeza getTipoPodaLimpeza() {
		return tipoPodaLimpeza;
	}

	public void setTipoPodaLimpeza(TipoPodaLimpeza tipoPodaLimpeza) {
		this.tipoPodaLimpeza = tipoPodaLimpeza;
	}

	public TipoFrequencia getTipoFrequenciaPoda() {
		return tipoFrequenciaPoda;
	}

	public void setTipoFrequenciaPoda(TipoFrequencia tipoFrequenciaPoda) {
		this.tipoFrequenciaPoda = tipoFrequenciaPoda;
	}

}
