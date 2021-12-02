package com.hemebiotech.analytics.sort;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortSymptoms implements ISymptomSort {

	public Map<String, Integer> mapSymptoms (List<String> symptomsList) {
		Map<String, Integer> map = new TreeMap<>();

		for(int i=0; i<symptomsList.size(); i++) {
			String currentSymptom = symptomsList.get(i);
			int countSymptom = map.getOrDefault(currentSymptom, 0) + 1;
			map.put(currentSymptom, countSymptom);
		}
		System.out.println(map);
		return map;

	}

}
