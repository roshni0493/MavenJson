package com.jbk.JsonDemo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.json.simple.JSONObject;

public class jsonwrite {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		JSONObject jo=new JSONObject();
		jo.put("firstname", "Roshni");
		jo.put("lastname", "Tale");
		jo.put("location", "pune");
		
		PrintWriter pw= new PrintWriter("write.json");
		pw.write(jo.toString());
		pw.flush();
		pw.close();
	}

}
