package com.codinglife.java.tally;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.codinglife.java.objects.FileToObjectMapping;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class Main {

	public static void main(String[] args)
			throws JsonParseException, JsonMappingException, FileNotFoundException, IOException {
		//08068103600
		  FileToObjectMapping fileToObjectMapping=new FileToObjectMapping();
		  fileToObjectMapping.readjson().forEach((n)->System.out.println(n));
		  
	}
}