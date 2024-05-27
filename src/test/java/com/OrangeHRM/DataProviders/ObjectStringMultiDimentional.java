package com.OrangeHRM.DataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ObjectStringMultiDimentional {

	    @Test(dataProvider = "dp1")
		
		 // public void loginApplication(String[] s) throws Exception {
		 // System.out.println(s[0]+">>>>>>>>>"+s[1]);
		 
	    
	    public void loginApplication(String Username, String Password) throws Exception {
			 System.out.println(Username+">>>>>>>>>"+Password);
	    }

	    @DataProvider
	    public String[][] dp1() {
	        String[][] data = new String[][]{
	        		{ "Admin","18515"},
	        		{"Admin","5148"},
	                {"customer","886979"}
	        };
	        return data;
	    }
	    
	    /*public void loginApplication(String[] s) throws Exception {
			 //System.out.println(Username+">>>>>>>>>"+Password);
	    	for(int i=0;i<s.length;i++) {
	    		
	    		System.out.println(s[i]);
	    	}
	    	System.out.println("--------------");
	    }

	    @DataProvider
	    public String[][] dp1() {
	        String[][] data = new String[][]{
	        		{ "Admin","18515","susharuth","Ram","Krishna"},
	        		{"Admin","5148","Rivansh"},
	                {"customer","886979","2983","Shiva"}
	        };
	        return data;
	    }*/
	    
	   /* public void loginApplication(Object[] s) throws Exception {
			 //System.out.println(Username+">>>>>>>>>"+Password);
	    	for(int i=0;i<s.length;i++) {
	    		
	    		System.out.println(s[i]);
	    	}
	    	System.out.println("--------------");
	    }

	    @DataProvider
	    public Object[][] dp1() {
	        Object[][] data = new Object[][]{
	        		{ "Admin",18515,"susharuth",55488,"Krishna"},
	        		{"Admin",5148,"Rivansh",null,null},
	                {"customer",886979,2983,"Shiva",null}
	        };
	        return data;*/
	    }
