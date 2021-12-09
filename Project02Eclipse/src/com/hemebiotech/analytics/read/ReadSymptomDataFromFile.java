package com.hemebiotech.analytics.read;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private final String filepath;
	
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) throws IOException {

		this.filepath = filepath;
		BufferedReader tryRead = new BufferedReader(new FileReader(filepath));

		try {
			tryRead.readLine();
		} catch (IOException e) {
			System.out.println("Caution, your file doesn't exist or is empty");
		}

	}
	
	@Override
	public List<String> GetSymptoms() throws IOException{
		ArrayList<String> result = new ArrayList<>();

				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
		
		return result;
	}

}
