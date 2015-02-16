package br.edu.doc.analisador.util;

import java.util.Map;

import br.edu.doc.analisador.util.Vector;

public class AngularSimilarity {
	
	public double getAngularSimilarity(Vector vectorCategoria, Vector vectorPergunta){
		double numerador = 0.0;
		double denominador = 0.0;
		double denominador1 = 0.0;
		double denominador2 = 0.0;
		
		Map<String, Float> mapVectorCategoria = vectorCategoria.getVector();
		Map<String, Float> mapVectorPergunta = vectorPergunta.getVector();
		
		for (String token : mapVectorCategoria.keySet()) {
			if (mapVectorPergunta.containsKey(token)) {
				numerador = numerador + mapVectorCategoria.get(token) * mapVectorPergunta.get(token);
				denominador1 = denominador1 + Math.pow(mapVectorCategoria.get(token), 2);
				denominador2 = denominador2 + Math.pow(mapVectorPergunta.get(token), 2);
			}
		}
		
		denominador = Math.sqrt(denominador1) * Math.sqrt(denominador2); 
		
		return numerador/denominador;
	}
	
}
