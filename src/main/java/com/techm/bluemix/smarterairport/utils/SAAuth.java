package com.techm.bluemix.smarterairport.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SAAuth {
 

	
	public static InputStream input = null;
	public static Properties prop= new Properties();
	
	static{
	String filename="/db.properties";
	input=SAProp.class.getClassLoader().getResourceAsStream(filename);
	try {
		prop.load(input);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}

