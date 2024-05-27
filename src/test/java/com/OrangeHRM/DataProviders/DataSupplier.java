package com.OrangeHRM.DataProviders;

import org.testng.annotations.DataProvider;

public class DataSupplier {

	@DataProvider(name="data")
	public String[] dataSet() {
		String[] dt=new String[] 
				{
				"RamKiran",
				"Pavan",
				"Shiva",
				"Faisal",
				"Dinesh",
				"Jawwad",
				"Sushanth",
				"Anuj"
				};
		return dt;
		}
	@DataProvider(name="data2")
	public String[] dataSet2() {
		String[] dt=new String[] 
				{
				"Akhil",
				"Sai",
				"Shivam",
				"Naresh",
				"Sannith",
				"Yogesh",
				"Akash",
				"Prathap"
				};
		return dt;
		}
	
}
