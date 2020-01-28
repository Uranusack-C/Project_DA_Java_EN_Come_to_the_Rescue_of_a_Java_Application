package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Uraa
 * Create a file "result.out" with all symptoms (no duplicate) with their occurence 
 *
 */
public class FileOutput
{
	/**
	 * @param Symptoms
	 * 			Map of symptoms (no duplicate) + occurrence
	 */
	public static void Output(Map<String, Long> Symptoms)
	{
		Map<String, Long> sortedMap	= new TreeMap<String, Long>(Symptoms);
		Set<?> set2					= sortedMap.entrySet();
		Iterator<?> iterator2		= set2.iterator();

		try (FileWriter writer = new FileWriter("result.out");)
		{
			while (iterator2.hasNext())
			{
				Map.Entry me2 = (Map.Entry) iterator2.next();
				writer.write(me2.getKey() + " = " + me2.getValue() + "\n");
			}
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}