package javaUtil.Formatter;

import java.util.Formatter;

public class FormatDemoRM {
	public static void main(String[] args) {
		try (Formatter fmt = new Formatter())
		{
			fmt.format("Formatting %s is easy %d %f", "with Java",
						10, 98.6);
			System.out.println(fmt);
		}
	}
}
