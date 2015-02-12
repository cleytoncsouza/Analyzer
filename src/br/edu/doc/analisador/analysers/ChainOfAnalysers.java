package br.edu.doc.analisador.analysers;

import java.util.ArrayList;

import br.edu.doc.analisador.correctors.Corrector;

public class ChainOfAnalysers {

	private Analyser[] analysers;
	
	
	public ChainOfAnalysers(Analyser[] analysers) {
		this.analysers = analysers;
	}
	
	public Corrector[] correct(String question) {
		
		ArrayList<Corrector> correctors = new ArrayList<Corrector>();
		
		for(Analyser analyser: analysers) {
			if (!analyser.analyse(question)) {
				
				Corrector corrector = analyser.getCorrector();
				
				correctors.add(corrector);
				
			}
		}
		
		return correctors.toArray(new Corrector[correctors.size()]);
		
	}
	
}
