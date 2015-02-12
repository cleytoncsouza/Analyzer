package br.edu.doc.analisador.util;

public class Coordinate {
	
	private String stem;
	
	private float frequency;

	public String getStem() {
		return stem;
	}

	public void setStem(String stem) {
		this.stem = stem;
	}

	public float getFrequency() {
		return frequency;
	}

	public void setFrequency(float frequency) {
		this.frequency = frequency;
	}
	
	public String toString() {
		return stem+"="+frequency+" ";
	}
}
