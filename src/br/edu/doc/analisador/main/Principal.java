package br.edu.doc.analisador.main;

import br.edu.doc.analisador.analysers.Analyser;
import br.edu.doc.analisador.analysers.ChainOfAnalysers;
import br.edu.doc.analisador.analysers.ExistsInterrogationMarkAnalyser;
import br.edu.doc.analisador.analysers.ExistsVocativeAnalyser;
import br.edu.doc.analisador.analysers.IsOpinionRequestAnalyser;
import br.edu.doc.analisador.analysers.TextIsTooLongAnalyser;
import br.edu.doc.analisador.correctors.Corrector;
import br.edu.doc.analisador.util.TreatmentStackOverflow;


public class Principal {

	public static void main(String[] args) {
	
//		String question = "onde devo ir comer hoje?";
//		
//		Analyser[] analysers = {
//								new ExistsInterrogationMarkAnalyser(), 
//								new ExistsVocativeAnalyser(),
//								new IsOpinionRequestAnalyser(),
//								new TextIsTooLongAnalyser()
//								};
//		
//		ChainOfAnalysers chainOfAnalysers = new ChainOfAnalysers(analysers);
//		
//		Corrector[] correctors = chainOfAnalysers.correct(question);
		
		String tag = "<Java><Php>";
		System.out.println(new TreatmentStackOverflow().replaceAndClearTag(tag));
		
		
	}
	
}
