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

import br.upe.verdinhas.catalogo.enums.TipoVaso;

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

}
