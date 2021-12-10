package com.hemebiotech.analytics.sort;

import java.util.List;
import java.util.Map;

public interface ISymptomSort {
	/**
	 *
	 * @return an ordered Map with count of occurrences
	 * @param symptomsList add list in parameter for the map
	 */

	Map<String, Integer> createMapSymptomAndSort(List<String> symptomsList);

}
