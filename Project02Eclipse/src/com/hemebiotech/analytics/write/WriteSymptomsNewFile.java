package com.hemebiotech.analytics.write;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class WriteSymptomsNewFile implements ISymptomWrite{

	private String encoding = "UTF-8";
	private String filepath = "filepath";

	public WriteSymptomsNewFile (String filepath) {
		this.filepath = filepath;
	}

	/**
	 * @param mapSymptoms
	 * use key and value to print file
	 *
	 */

	public void printFile (Map<String, Integer> mapSymptoms) {
		String print = new String();
		try {
			PrintWriter writer = new PrintWriter(filepath, encoding);

			for(Map.Entry<String, Integer> entry : mapSymptoms.entrySet()) {
				writer.write(entry.getKey() + " : " + entry.getValue() + "\n");
			}

			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
