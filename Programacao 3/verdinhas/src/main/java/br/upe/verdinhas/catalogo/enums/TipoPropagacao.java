package br.upe.verdinhas.catalogo.enums;

public enum TipoPropagacao {

	ESTAQUIA(0), 
	SEMENTE(1);

	public final int codigo;
	
	TipoPropagacao(int c) {
		this.codigo = c;
	};

	public static TipoPropagacao getByCodigo(int c) {
		for (TipoPropagacao tipoPropagacao : TipoPropagacao.values()) {
			if (c == tipoPropagacao.codigo) {
				return tipoPropagacao;
			}
		}
		throw new IllegalArgumentException("Tipo propagação inválido");
		
	}
	
}
