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
import static java.lang.System.in;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Amrapali
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
    
    	Input_Parser_Impl();
        
        DbFldsTempl2_Updates();
        
        SortColumns();
        
        Group_By_Columns();
        
        Output_File();              
                           
    }
    
	private static void Input_Parser_Impl() throws IOException {
		// TODO Auto-generated method stub
		
		Input_Parser ip = new Input_Parser();
		
		System.out.println("Class : " + ip.getClass().getName() + " elements are as follows :");
		System.out.println("");
		               
        String Col_1 = ip.ReadColumn1();
        String Col_2 = ip.ReadColumn2();
        
        System.out.println(Col_1);
        System.out.println(Col_2);
        
        System.out.println("");
		
	}  
    
	private static void DbFldsTempl2_Updates() throws FileNotFoundException {
		// TODO Auto-generated method stub
						
		DbFldsTempl2 dbfltmp = new DbFldsTempl2();
        
		System.out.println("Class : " + dbfltmp.getClass().getName() + " elements are as follows :");
		System.out.println("");
				
		dbfltmp.DbFldsTempl2_Updates();
                
        System.out.println("");
		
	}  

	private static void SortColumns() throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Sort s = new Sort();
		
		System.out.println("Class : " + s.getClass().getName() + " elements are as follows :");
		System.out.println("");
		
        s.SortColumns();
        
        System.out.println("");
		
	}
	
	private static void Group_By_Columns() throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Group_By grp  = new Group_By();
		
		System.out.println("Class : " + grp.getClass().getName() + " elements are as follows :");
		System.out.println("");
		
		grp.Group_By_Columns();
		
		System.out.println("");
	}
	
	private static void Output_File() throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		OutputFile out = new OutputFile();
		
		System.out.println("Class : " + out.getClass().getName() + " elements are as follows :");
		System.out.println("");
		
		out.Output_File();
		
		System.out.println("");
		
	}
	
	private static void Output_File() throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		OutputFile out = new OutputFile();
		
		System.out.println("Class : " + out.getClass().getName() + " elements are as follows :");
		System.out.println("");
		
		out.Output_File();
		
		System.out.println("");
		
	}
        
}
