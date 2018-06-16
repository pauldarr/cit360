package client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import qcjson.*;
import model.EmployeeBean;

public class Test {

	public static void main(String[] args) {

		EmployeeBean employee = new EmployeeBean("Paul", "Darr", 2012, 9 );		
		File employeeFile = new File("employeeFile.json");
		
		try {
			
			// adds return from utility to variable and prints to console
			String jsonString = JSONUtilities.stringify(employee);
			System.out.printf("<--Java object converted to json and written to employeeFile and Console:-->%n");	
			System.out.println(jsonString);		
			
			// creates file and adds return from JSON helper to variable and prints to file
			FileOutputStream fileStream = new FileOutputStream(employeeFile);
			JSONOutputStream jsonOut = new JSONOutputStream(fileStream);
			jsonOut.writeObject(employee);
			jsonOut.close();	
			
		} catch (JSONException | IOException e) {
			e.printStackTrace();
		}
		
		try {
			
			// reads from file
			FileInputStream fileStream = new FileInputStream(employeeFile);
			JSONInputStream jsonIn = new JSONInputStream(fileStream);
			
			HashMap jsonMap = (HashMap)jsonIn.readObject();
			jsonIn.close();
			
			EmployeeBean employeeIn = new EmployeeBean();
			employeeIn.setFirstName((String)jsonMap.get("firstName"));
			employeeIn.setLastName((String)jsonMap.get("lastName"));
			long startYear = (long)jsonMap.get("startYear");
			employeeIn.setStartYear((int)startYear);
			employeeIn.setPayRate((double)jsonMap.get("payRate"));
			
			String jsonString = JSONUtilities.stringify(employeeIn);
			System.out.printf("%n<--This is the JSON string in the employeeFile:-->");	
			System.out.printf("%n" + jsonString + "%n");	
			System.out.printf("%n<--JSON string converted back to java from the employeeFile and values are added to EmployeeBean java object:-->");	
			System.out.printf("%n" + employeeIn.getFirstName() + " " + employeeIn.getLastName() + " " + employeeIn.getStartYear() + " " + employeeIn.getPayRate() + "%n");

			
		} catch (JSONException | IOException | ParseException e) {
			e.printStackTrace();
		}
		
	}

}
