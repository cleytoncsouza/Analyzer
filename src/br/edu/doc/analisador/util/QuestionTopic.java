package br.edu.doc.analisador.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import br.edu.doc.analisador.extractor.Extractor;

public enum QuestionTopic {
	TECHNOLOGY,
	ENTERTAINMENT,
	HOME_AND_FAMILY,
	PROFESSIONAL, 
	PLACES, 
	RESTAURANTS,
	CURRENT_EVENTS,
	SHOPPING, 
	ETHICS_AND_PHILOSOPHY;
	
	static {
		try {
			BufferedReader bf = new BufferedReader(new FileReader(new File("extra/samples.txt")));
			
			StringBuffer text = new StringBuffer();
			String linha = bf.readLine();
			
			while (linha!=null) {
				text.append(linha);
				text.append(" ");
				linha = bf.readLine();
			}
			
			TECHNOLOGY.setVector(Extractor.vector(text.toString()));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private Vector vector;

	public Vector getVector() {
		return vector;
	}

	public void setVector(Vector vector) {
		this.vector = vector;
	}

}
