package com.Practice.ParallelExecutionTests;

import org.testng.annotations.Test;

public class Test2 {

	@Test
	public void testMethod6() {
		System.out.println("Test2>>>testMethod6>>>"+ Thread.currentThread().getId());
				}
	@Test
	public void testMethod7() {
		System.out.println("Test2>>>testMethod7>>>"+ Thread.currentThread().getId());
				}
	@Test
	public void testMethod8() {
		System.out.println("Test2>>>testMethod8>>>"+ Thread.currentThread().getId());
				}
	@Test
	public void testMethod9() {
		System.out.println("Test2>>>testMethod9>>>"+ Thread.currentThread().getId());
				}
	@Test
	public void testMethod10() {
		System.out.println("Test2>>>testMethod10>>>"+ Thread.currentThread().getId());
				}
}
