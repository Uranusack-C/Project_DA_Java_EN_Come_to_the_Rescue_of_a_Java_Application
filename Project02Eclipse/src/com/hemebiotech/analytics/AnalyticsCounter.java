package com.hemebiotech.analytics;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author Uraa
 * Count all occurence of symptoms and put it on a Map
 */
public class AnalyticsCounter
{
	/**
	 * 
	 * @param allSymptoms
	 * 		List of all symptoms (duplicate)
	 * @return 
	 * 		Map of symptoms (no duplicate) + occurence
	 *  
	 */
	public static Map<String, Long> CountOccurence(List<String> allSymptoms)
	{
		Set<String> mySet			= new HashSet<>(allSymptoms);
		List<String> simpleSymptoms	= new ArrayList<>(mySet);

		String tabSymptoms[]		= new String[allSymptoms.size()];
		tabSymptoms					= allSymptoms.toArray(tabSymptoms);

		Map<String, Long>	all		= new HashMap<String, Long>();
		try
		{
			for (int i = 0; i < simpleSymptoms.size(); i++)
			{
				final int FINALI = i;
				all.put(simpleSymptoms.get(i), Stream.of(tabSymptoms).filter(e -> e.equals(simpleSymptoms.get(FINALI))).count());
			}
		}
		catch (Exception e)
		{
			
		}
		return all;
	}
}