package com.sushanth.practice;

import org.testng.annotations.Test;

public class DependenciesPractice {
	
	static String trackingNumber= null;
	
	@Test
	public void createShipment() {
		//System.out.println(5/0);
		System.out.println("Created Shipment");
		trackingNumber= "ABC19824PI";
	}
	@Test(dependsOnMethods = {"createShipment"})
	public void trackShipment() throws Exception{
		if(trackingNumber != null)
			System.out.println("Track Shipment");
		else
			throw new Exception("Invalid tracking number");
	}
	
	@Test(dependsOnMethods = {"createShipment"})
	public void cancelShipment() throws Exception{
		
		if(trackingNumber !=null)
			System.out.println("Cancel Shipment");
		else
			throw new Exception("Invalid tracking number");
	}

}
