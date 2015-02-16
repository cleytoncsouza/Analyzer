package br.edu.doc.analisador.util;

import org.jsoup.Jsoup;

public class TreatmentStackOverflow {

	public String clearRatings(String content) {
		String[] codes = { "code" };
		int i = 0;
		while (content.contains("<" + codes[i] + ">")) {
			if (content.contains("<" + codes[i] + ">")
					&& content.contains("</" + codes[i] + ">")) {
				int posicaoInicial = content.indexOf("<" + codes[i] + ">");
				int posicaoFinal = content.indexOf("</" + codes[i] + ">")
						+ codes[i].length() + 3;

				for (int j = posicaoInicial; j < posicaoFinal; j++) {
					content = removeCharAt(content, posicaoInicial);
				}
			}
			
		}
		return html2text(content);

	}

	public String removeCharAt(String s, int pos) {
		return s.substring(0, pos) + s.substring(pos + 1);
	}

	public String html2text(String html) {
		return Jsoup.parse(html).text();
	}

}
