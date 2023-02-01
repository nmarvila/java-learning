package javaUtil.ResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class LRBDemo {
	public static void main(String[] args) {
		ResourceBundle rd = ResourceBundle.getBundle("javaUtil.ResourceBundle.SampleRB");
		
		System.out.println("English version: ");
		System.out.println("String for Title key: " +
							rd.getString("title"));
		
		System.out.println("String for StopText key: " +
							rd.getString("StopText"));
		
		System.out.println("String for StartText key: " +
							rd.getString("StartText"));
		
		rd = ResourceBundle.getBundle("javaUtil.ResourceBundle.SampleRB", Locale.GERMAN);
		
		System.out.println("\nGerman version: ");
		System.out.println("String for Title key: " +
							rd.getString("title"));
		
		System.out.println("String for StopText key: " +
							rd.getString("StopText"));
		
		System.out.println("String for StartText key: " +
							rd.getString("StartText"));
	}
}
