package pentahoe;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Amrapali
 */
public class Input_Parser {
	
	   public Input_Parser() throws FileNotFoundException {
	        
	    }

FileReader input = new FileReader("H:\\My Documents\\Amrapali\\Pentahoe Project\\Input_1.txt");;
BufferedReader bufRead = new BufferedReader(input);
String strLine = null;

String col1 = null;
String col2 = null;
   
public void AddLine() throws IOException {
        
    List<String> list = new ArrayList<String>();
    while((strLine = bufRead.readLine()) != null){
        list.add(strLine);
    }
    String[] stringArr = list.toArray(new String[0]);       
    //System.out.println(stringArr[1]);
    
    for (int i= 0; i < stringArr.length; i++)
    
        System.out.println(stringArr[i]);

    }

public String ReadColumn1() throws IOException {
	  
List<String> list = new ArrayList<String>();
    while((strLine = bufRead.readLine()) != null){
        list.add(strLine);
    }
    String[] colArr = list.toArray(new String[0]);       
    
    String delim = ",";
    
    System.out.println("Delimiter is : " + "'" + delim + "'");
    
    for(int i =0; i<colArr.length; i++) {
            int charPos = colArr[i].indexOf(delim);
            
            if(charPos!=-1) {            	      	
            	            	            	
            	col1 = colArr[i].split("\\,")[0];
            	
            	col2 = colArr[i].split("\\,")[1].split("[\\(\\)]")[1];        	            	
            	            	
            }
    }
	
    return col1;
		          
  }

public String ReadColumn2() throws IOException {
	  
	List<String> list = new ArrayList<String>();
	    while((strLine = bufRead.readLine()) != null){
	        list.add(strLine);
	    }
	    String[] colArr = list.toArray(new String[0]);       
	    
	    String delim = ",";
	    
	       
	    for(int i =0; i<colArr.length; i++) {
	            int charPos = colArr[i].indexOf(delim);
	            
	            if(charPos!=-1) {            	      	
	            	            	            	
	            	col1 = colArr[i].split("\\,")[0];
	            	
	            	col2 = colArr[i].split("\\,")[1].split("[\\(\\)]")[1];        	            	
	            	            	
	            }
	    }
		
	    return col2;
			          
	  }

}

