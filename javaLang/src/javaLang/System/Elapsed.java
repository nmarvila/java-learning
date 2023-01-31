package javaLang.System;

public class Elapsed {
	public static void main(String[] args) {
		long start, end;
		
		System.out.println("Timing a for loop from 0 to 100,000,000");
		
		start = System.nanoTime();
		for(long i=0; i < 100000000L; i++) ;
		end = System.nanoTime();
		
		System.out.println("Elapsed time: " + (end-start));
	}
}
