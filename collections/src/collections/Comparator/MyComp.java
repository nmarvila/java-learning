package collections.Comparator;

import java.util.Comparator;

public class MyComp implements Comparator<String> {
	public int compare(String aStr, String bStr) {
		return aStr.compareTo(bStr);
	}
}
