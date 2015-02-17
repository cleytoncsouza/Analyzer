package br.edu.doc.analisador.util;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class CsvFileReader {
	private static final String[] FILE_HEADER_MAPPING = { "title", "content",
			"tags" };
	private static final String TITLE = "title";
	private static final String CONTENT = "content";
	private static final String TAGS = "tags";

	public List<InQuestion> readCsvFile(String fileName) {
		FileReader fileReader = null;
		CSVParser csvFileParser = null;
		CSVFormat csvFileFormat = CSVFormat.DEFAULT
				.withHeader(FILE_HEADER_MAPPING);

		try {
			List<InQuestion> questions = new ArrayList<InQuestion>();
			fileReader = new FileReader(fileName);
			csvFileParser = new CSVParser(fileReader, csvFileFormat);
			List<CSVRecord> csvRecords = csvFileParser.getRecords();
			for (int i = 1; i < csvRecords.size(); i++) {
				CSVRecord record = csvRecords.get(i);
				TreatmentStackOverflow tramamento = new TreatmentStackOverflow();
				InQuestion question = new InQuestion(record.get(TITLE),
						tramamento.clearRatings(record.get(CONTENT)),
						tramamento.replaceAndClearTag(record.get(TAGS)));
				questions.add(question);
			}
			return questions;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				fileReader.close();
				csvFileParser.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		throw new RuntimeException("Erro o tratar o dataset");
	}

}
