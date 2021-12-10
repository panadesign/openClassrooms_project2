package com.hemebiotech.analytics.write;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class WriteSymptomsNewFile implements ISymptomWrite {

	private final String encoding = StandardCharsets.UTF_8.name();
	private final String filepath;

	public WriteSymptomsNewFile(String filepath) {
		this.filepath = filepath;

		File f = new File(filepath);
	}

	/**
	 * @param mapSymptoms use key and value to print file
	 */

	public void printFile(Map<String, Integer> mapSymptoms) {
		try {
			PrintWriter writer = new PrintWriter(filepath, encoding);

			for (Map.Entry<String, Integer> entry : mapSymptoms.entrySet()) {
				writer.write(entry.getKey() + " : " + entry.getValue() + "\n");
			}

			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
