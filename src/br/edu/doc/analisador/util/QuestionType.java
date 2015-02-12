package br.edu.doc.analisador.util;

public enum QuestionType {
	RECOMMENDATION,
	OPINION, 
	FACTUAL_KNOWLEDGE,
	RHETORICAL,
	INVITATION, 
	FAVOR,
	SOCIAL_CONNECTION,
	OFFER;
	
	static {
		//TODO setar as coordenadas para cada um dos tipos de pergunta
	}
	
	private Vector vector;

	public Vector getVector() {
		return vector;
	}

	public void setVector(Vector vector) {
		this.vector = vector;
	}
	
}
