package br.edu.doc.analisador.analysers;

import br.edu.doc.analisador.correctors.Corrector;

public class TextIsTooLongAnalyser implements Analyser{

	public static int MAX_QUESTION_SIZE = 144;

	@Override
	public Boolean analyse(String question) {
		return (question.length()>MAX_QUESTION_SIZE);
	}

	@Override
	public Corrector getCorrector() {
		// TODO Auto-generated method stub
		return null;
	}

}
