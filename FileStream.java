package com.codinglife.java.tally;

import java.io.FileReader;

import org.json.simple.parser.JSONParser;

public class FileStream {
	
	public static Object readJsonSimpleDemo(String filename) throws Exception {
	    FileReader reader = new FileReader(filename);
	    JSONParser jsonParser = new JSONParser();
	    return jsonParser.parse(reader);
	}

	

}
