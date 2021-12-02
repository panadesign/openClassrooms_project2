package com.hemebiotech.analytics;

import com.hemebiotech.analytics.read.ReadSymptomDataFromFile;

import java.util.List;

public class AnalyticsCounter {

	public static void main(String[] args) throws Exception {
		ReadSymptomDataFromFile readSymptom = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		List<String> symptomsList = readSymptom.GetSymptoms();
	}
}
