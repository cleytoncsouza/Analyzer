package br.edu.doc.analisador.main;

import java.util.List;

import br.edu.doc.analisador.extractor.Extractor;
import br.edu.doc.analisador.util.CsvFileReader;
import br.edu.doc.analisador.util.InQuestion;
import br.edu.doc.analisador.util.Vector;


public class Principal {

	public static void main(String[] args) {
		List<InQuestion> questions = new CsvFileReader().readCsvFile("./extra/orientação-a-objetos_test.csv");
		Vector auxVector = null;
		for (InQuestion inQuestion : questions) {
			auxVector = Extractor.vector(inQuestion.getContent());
		}
		
		System.out.println(auxVector);
	}
}
