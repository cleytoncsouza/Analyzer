package br.edu.doc.analisador.analysers;

import br.edu.doc.analisador.correctors.Corrector;

public interface Analyser {
	
	public Boolean analyse(String question);
	
	public Corrector getCorrector();
	
	
}
