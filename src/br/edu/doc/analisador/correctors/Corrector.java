package br.edu.doc.analisador.correctors;

import br.edu.doc.analisador.analysers.Analyser;

public interface Corrector {
	
	public Tip getTip();
	
	public String correct();
	
	public Analyser getAnalyser();

}
