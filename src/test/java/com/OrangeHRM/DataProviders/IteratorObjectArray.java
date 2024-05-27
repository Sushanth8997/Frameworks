package com.OrangeHRM.DataProviders;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IteratorObjectArray {
	

    @Test(dataProvider = "dp1")
	
	 // public void loginApplication(String[] s) throws Exception {
	 // System.out.println(s[0]+">>>>>>>>>"+s[1]);
	 
    
    public void loginApplication(String[] s) throws Exception {
		 System.out.println(s[0]+"  "+s[1]+"  "+s[2]);
    }

    @DataProvider
    public Iterator<String[]> dp1() {
       List<String[]>data=new ArrayList<>();
       data.add(new String[] {"Ritvik","Vicky","Raavan"});
       data.add(new String[] {"Sachin","Ranbir","Hanuman"});
 
        return data.iterator();
    }

}
