package com.hemebiotech.analytics;

import java.util.Map;

public class Launcher
{
    public static void main(String[] args)
    {
    	ReadSymptomDataFromFile rsdff;
    	Map<String, Long> myMap;

    	rsdff	= new ReadSymptomDataFromFile("../Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt");
    	myMap	= AnalyticsCounter.CountOccurence(rsdff.GetSymptoms());
    	FileOutput.Output(myMap);
    }
}