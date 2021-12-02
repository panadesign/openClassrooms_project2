package com.hemebiotech.analytics;

import com.hemebiotech.analytics.read.ReadSymptomDataFromFile;
import com.hemebiotech.analytics.sort.ISymptomSort;
import com.hemebiotech.analytics.sort.SortSymptoms;
import com.hemebiotech.analytics.write.WriteSymptomsNewFile;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

	public static void main(String[] args) {

		ReadSymptomDataFromFile readSymptom = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		List<String> symptomsList = readSymptom.GetSymptoms();

		ISymptomSort sortSymptoms = new SortSymptoms();
		Map<String, Integer> mapSymptoms = sortSymptoms.mapSymptoms(symptomsList);

		WriteSymptomsNewFile write = new WriteSymptomsNewFile("Project02Eclipse/results.out");
		write.printFile(mapSymptoms);

	}
}
