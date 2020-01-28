package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader
{
	private String filepath;

	/**
	 * 
	 * @param filepath
	 *            a full or partial path to file with symptom strings in it, one
	 *            per line
	 */
	public ReadSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}

	/**
	 * @result
	 * 		List of all symptoms duplicate
	 **/
	@Override
	public List<String>	GetSymptoms()
	{
		ArrayList<String> result = new ArrayList<String>();

		if (filepath != null)
		{
			try	(
					FileReader fr = new FileReader(filepath); 
					BufferedReader reader = new BufferedReader(fr);
				)
			{
				String line = reader.readLine();
				while (line != null)
				{
					result.add(line);
					line = reader.readLine();
				}
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		return result;
	}
}
