package com.hackerrankandothers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class EndOfLife {

	public static void main(String[] args) throws FileNotFoundException {
		File file=new File("C:\\Users\\Vasantha Kumar\\Desktop\\String.txt");//C:\Users\Vasantha Kumar\Desktop
		   Scanner sc=new Scanner(file);
		      ArrayList<String>  ar=new ArrayList<String>();
		        
		      while(sc.hasNextLine()) {
		    	  String j=sc.nextLine();
		    	  ar.add(j);
		           
		        }
		          for(int i=0;i<ar.size();i++){
		            System.out.println((i+1)+" "+ar.get(i));
		        }
		          sc.close();
	}

}
