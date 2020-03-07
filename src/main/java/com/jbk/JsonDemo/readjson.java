package com.jbk.JsonDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

//import jsondemo.jsonread;

public class readjson {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		//Logger log=Logger.getLogger(jsonread.class);
		//PropertyConfigurator.configure("jsonfile.properties");
		
		Object obj=new JSONParser().parse(new FileReader("write.json"));
		JSONObject  jo= (JSONObject) obj;
		
		String Firstname=(String) jo.get("firstname");
		//log.debug("first name get");
		
		String Lastname=(String) jo.get("lastname");
		//log.debug("lastname get");
		
		String Location=(String) jo.get("location");
		//log.debug("location get properly");
		
	}

}
