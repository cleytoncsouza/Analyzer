package br.edu.doc.analisador.analysers;

import br.edu.doc.analisador.correctors.Corrector;

public class ExistsInterrogationMarkAnalyser implements Analyser{

	public Boolean analyse(String question) {
		return question.indexOf("?")!=-1;
	}

	public Corrector getCorrector() {
		return null;
	}

}
