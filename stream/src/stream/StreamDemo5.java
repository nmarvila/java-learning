package stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo5 {
	public static void main(String[] args) {
		ArrayList<NamePhoneEmail> myList = new ArrayList<>();
		
		myList.add(new NamePhoneEmail("Larry", "555-5555",
										"Larry@HerbSchildt.com"));
		myList.add(new NamePhoneEmail("James", "555-4444",
										"James@HerbSchildt.com"));
		myList.add(new NamePhoneEmail("Mary", "555-3333",
										"Mary@HerbSchildt.com"));
		
		System.out.println("Original values in myList: ");
		myList.stream().forEach((a) -> {
			System.out.println(a.name + " " + a.phonenum + " " + a.email);
		});
		System.out.println();
		
		Stream<NamePhone> nameAndPhone = myList.stream().map(
										(a) -> new NamePhone(a.name,a.phonenum)
										);
		
		System.out.println("List of names and phone numbers: ");
		nameAndPhone.forEach((a) -> {
			System.out.println(a.name + " " + a.phonenum);
		});
	}
}
