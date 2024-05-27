package com.OrangeHRM.DataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Indices {

	@Test(dataProvider="dp1")
	public void indicesProgram(String s) throws Exception{
		System.out.println(s);
	}
	
	@DataProvider(indices= {2,6})
	public String[] dp1() {
		String[] data =new String[] {
				
				"RamKiran",
				"Pavan",
				"Shiva",
				"Faisal",
				"Dinesh",
				"Jawwad",
				"Sushanth",
				"Anuj"
		};
		return data;
	}
}
