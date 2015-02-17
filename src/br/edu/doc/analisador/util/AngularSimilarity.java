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
		
		for (String tokenCategoria : mapVectorCategoria.keySet()) {
			if (mapVectorPergunta.containsKey(tokenCategoria)) {
				numerador = numerador + mapVectorCategoria.get(tokenCategoria) * mapVectorPergunta.get(tokenCategoria);
			}
			denominador1 = denominador1 + Math.pow(mapVectorCategoria.get(tokenCategoria), 2);
		}
		for (String tokenPergunta : mapVectorPergunta.keySet()) {
			denominador2 = denominador2 + Math.pow(mapVectorPergunta.get(tokenPergunta), 2);
		}
		
		denominador = Math.sqrt(denominador1) * Math.sqrt(denominador2); 
		
		if (denominador == 0.0f) {
			return 0.0f;
		}
		return numerador/denominador;
	}
}
