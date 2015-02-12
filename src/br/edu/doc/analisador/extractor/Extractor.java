package br.edu.doc.analisador.extractor;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import br.com.myproject.ri.lucene.util.LuceneUtil;
import br.edu.doc.analisador.util.Coordinate;
import br.edu.doc.analisador.util.Vector;

public class Extractor {
	
	public static Vector vector(String text) {
		
		String[] stems = LuceneUtil.tokenizeString(new StringBuffer(text)).toString().split(" ");
		
		Map<String, Float> map = new HashMap<String, Float>();

		if (stems.length!=0) {
			
			float inc = (float)1/stems.length;
		
			for(int i=0; i<stems.length;i++) {
				
				String stem = stems[i];
		
				Float freq = map.get(stem);
				
				if (freq == null) {
					map.put(stem, inc);
				} else {
					map.put(stem, freq+inc);
				}//else
				
			}//for
			
		}//if
		
		return new Vector(map);
	}
	
}
