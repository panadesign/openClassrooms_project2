package com.hemebiotech.analytics.sort;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortSymptoms implements ISymptomSort {

	/**
	 * @param symptomsList sort data by alphabetical order and count data occurrences
	 * @return return a map of symptomsList
	 */

	public Map<String, Integer> createMapSymptomAndSort(List<String> symptomsList) {
		Map<String, Integer> map = new TreeMap<>();

		for (String currentSymptom : symptomsList) {
			int countSymptom = map.getOrDefault(currentSymptom, 0) + 1;
			map.put(currentSymptom, countSymptom);
		}

		return map;

	}

}
