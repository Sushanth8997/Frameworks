package com.OrangeHRM.DataProviders;

import org.testng.annotations.Test;

public class SeperateDataProviderClass {

	@Test(dataProvider="data2", dataProviderClass=DataSupplier.class)
	public void test(String s) {
		System.out.println(s);
	}
}
