package com.hemebiotech.analytics;

import com.hemebiotech.analytics.read.ISymptomReader;
import com.hemebiotech.analytics.read.ReadSymptomDataFromFile;
import com.hemebiotech.analytics.sort.ISymptomSort;
import com.hemebiotech.analytics.sort.SortSymptoms;
import com.hemebiotech.analytics.write.ISymptomWrite;
import com.hemebiotech.analytics.write.WriteSymptomsNewFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

	public static void main(String[] args) throws IOException {

		ISymptomReader readSymptom = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		List<String> symptomsList = readSymptom.GetSymptoms();

		ISymptomSort sortSymptoms = new SortSymptoms();
		Map<String, Integer> sortedSymptom = sortSymptoms.createMapSymptomAndSort(symptomsList);

		ISymptomWrite writeSymptom = new WriteSymptomsNewFile("Project02Eclipse/results.out");
		writeSymptom.printFile(sortedSymptom);

	}
}
