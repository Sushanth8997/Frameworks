package com.OrangeHRM.DataProviders;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IteratorObject {

	    @Test(dataProvider = "dp1")
		
		 // public void loginApplication(String[] s) throws Exception {
		 // System.out.println(s[0]+">>>>>>>>>"+s[1]);
		 
	    
	    public void loginApplication(String s) throws Exception {
			 System.out.println(s);
	    }

	    @DataProvider
	    public Iterator<String> dp1() {
	       List<String>data=new ArrayList<>();
	       data.add("Ritvik");
	       data.add("Laxman");
	 
	        return data.iterator();
	    }
}
