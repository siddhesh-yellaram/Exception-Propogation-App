package com.techlab.test;

public class RuntimeExceptionTest {

	public static void main(String[] args) {
		try {
			System.out.println("Inside main");
			foo1();
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End of main");
	}
	
	public static void foo1() {
		System.out.println("Inside Foo 1");
		foo2();
	}
	
	public static void foo2() {
		System.out.println("Inside Foo 2");
		foo3();
	}
	
	public static void foo3() {
		System.out.println("Inside Foo 3");
		throw new RuntimeException("Something went wrong");
	}
}
