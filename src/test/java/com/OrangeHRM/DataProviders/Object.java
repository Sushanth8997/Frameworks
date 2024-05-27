package com.OrangeHRM.DataProviders;

	import java.util.ArrayList;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

public class Object {
	@Test(dataProvider="OnlyObject")
	public void loginApplication(Integer s) throws Exception{	
		
	//	for(int i=0;i<s1.length;i++) {
			System.out.println(s);
		}
	
	@DataProvider(name="OnlyObject")
	public Integer[] loginData(){
		Integer[] data=new Integer[]{
		   
				12354,
		
		   
				897135468,
		
		    8434
		};
		return data;
	}}
    
		/*@Test(dataProvider= "OnlyObject")
		public void loginApplication(String s1) throws Exception{	
			
		//	for(int i=0;i<s1.length;i++) {
				System.out.println(s1);
			}
		
		@DataProvider(name="OnlyObject")
		public String[] loginData(){
			String[] data=new String[]{
			   
					"12354",
			
			   
					"Admin",
			
			    "8434"
			};
			return data;*/
