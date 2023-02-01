package javaUtil.Formatter;

import java.util.Formatter;

public class FormatDemo2 {
	public static void main(String[] args) {
		Formatter fmt = new Formatter();
		
		for(double i=1.23; i < 1.0e+6; i *= 100) {
			fmt.format("%f %e ", i, i);
			System.out.println(fmt);
		}
		
		fmt.close();
		
		fmt = new Formatter();
		fmt.format("Hex: %x, Octal: %o", 196, 196);
		System.out.println(fmt);
		
		fmt.close();
		
		fmt = new Formatter();
		fmt.format("%a", 512.0);
		System.out.println(fmt);
		
		fmt.close();
	}
}
