package br.edu.doc.analisador.util;

public enum ExpressionType {
	NUMBER, 
	MEASURE,
	TIME_STAMP,
	ADDRESS,
	PEOPLE,
	ORGANIZATION,
	PLACE,
	PRODUCT,
	OTHER;
	
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
