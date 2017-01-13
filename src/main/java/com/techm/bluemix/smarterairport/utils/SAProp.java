package com.techm.bluemix.smarterairport.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SAProp {
 

	
	public static InputStream input = null;
	public static Properties prop= new Properties();
	
	static{
	
	try {
		input= new FileInputStream("/src/main/resources/airport.properties");
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		prop.load(input);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}

