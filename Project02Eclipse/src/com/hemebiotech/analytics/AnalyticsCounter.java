package com.hemebiotech.analytics;

import com.hemebiotech.analytics.read.ReadSymptomDataFromFile;
import com.hemebiotech.analytics.sort.ISymptomSort;
import com.hemebiotech.analytics.sort.SortSymptoms;

import java.util.List;

public class AnalyticsCounter {

	public static void main(String[] args) throws Exception {
		ReadSymptomDataFromFile readSymptom = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		List<String> symptomsList = readSymptom.GetSymptoms();

		ISymptomSort sortSymptoms = new SortSymptoms();
		sortSymptoms.mapSymptoms(symptomsList);

	}
}
