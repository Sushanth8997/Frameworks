package com.Practice.ParallelExecutionTests;

import org.testng.annotations.Test;

public class Test4 {
	
	@Test
	public void testMethod15() {
		System.out.println("Test4>>>testMethod15>>>"+ Thread.currentThread().getId());
				}
	@Test
	public void testMethod16() {
		System.out.println("Test4>>>testMethod16>>>"+ Thread.currentThread().getId());
				}
	@Test
	public void testMethod17() {
		System.out.println("Test4>>>testMethod17>>>"+ Thread.currentThread().getId());
				}
	@Test
	public void testMethod18() {
		System.out.println("Test4>>>testMethod18>>>"+ Thread.currentThread().getId());
				}

}
