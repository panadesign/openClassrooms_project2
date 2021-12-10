package com.hemebiotech.analytics.read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private final String filepath;

	/**
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile(String filepath) throws IOException {
		if (filepath == null || filepath.isEmpty()) {
			throw new IllegalArgumentException("Filepath is empty");
		}

		File f = new File(filepath);
		if (!f.exists() || f.isDirectory() || f.length() == 0) {
			throw new IOException("Caution! File not found or not valid or empty");
		}

		this.filepath = filepath;

	}

	@Override
	public List<String> GetSymptoms() {
		ArrayList<String> result = new ArrayList<>();

		try {
			BufferedReader reader = new BufferedReader(new FileReader(filepath));
			String line = reader.readLine();

			while (line != null) {
				result.add(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();

		}


		return result;
	}

}
