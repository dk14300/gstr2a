package com.codinglife.java.tally;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.List;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class Main {

	
	  public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException { 
	
	  GSTR237AGZPK5154E1ZYMarch201920 march201920 = new GSTR237AGZPK5154E1ZYMarch201920();
	  
	  InputStream jsondata = new FileInputStream("C:\\Users\\sukumar\\Desktop\\format.json");
	  
	  //byte[] jsonData = Files .readAllBytes(Paths.get("C:\\Users\\sukumar\\Desktop\\GSTR-2_37AGZPK5154E1ZY_March_2019-20.json"));
	  
	  //create ObjectMapper instance InputStream jsondata = new FileInputStream("C:\\Users\\sukumar\\Desktop\\format.json"); 
	  ObjectMapper objectMapper = new ObjectMapper();
	  objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);

	  
	  // convert json string to object //march201920 =
	  //objectMapper.readValue(jsondata, GSTR237AGZPK5154E1ZYMarch201920.class);
	  //objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true); 
	  // writing	  to console, can write to any output stream such as file
	  
	  StringWriter stringEmp = new StringWriter();
	  objectMapper.writeValue(stringEmp, march201920);
	  System.out.println(stringEmp);
	  
	  
	  JsonFactory factory = new JsonFactory(); 
	  JsonParser parser =factory.createParser(jsondata);
	  
	  //B2b employeList = objectMapper.readValue(jsondata,B2b.class); 

	  
	  
	  while (!parser.isClosed()) { 
		  Inv inv=new Inv();
		  ItmDet itmDet=new ItmDet();
	  
	  JsonToken jsonToken = parser.nextToken();
	  System.out.println("Here lets see the"+jsonToken);
	  
	  
	  
	  if (JsonToken.FIELD_NAME.equals(jsonToken)) { 
		  String fieldName = parser.getCurrentName(); 
		  System.out.println(fieldName);
	  
	  jsonToken = parser.nextToken();
	  List<B2b> list = objectMapper.readValue(jsondata,TypeFactory.defaultInstance().constructCollectionType(List.class,B2b.class)); System.out.println(list.toString());
	  
	  
	  }
	  }
	  }
	  }