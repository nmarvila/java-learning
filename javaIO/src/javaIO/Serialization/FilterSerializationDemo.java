package javaIO.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputFilter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FilterSerializationDemo {
	public static void main(String[] args) {
		try ( ObjectOutputStream objOStrm =
				new ObjectOutputStream(new FileOutputStream("serial")) )
		{
			MyClass object1 = new MyClass("Hello", -7, 2.7e10);
			System.out.println("object1: " + object1);
			
			objOStrm.writeObject(object1);
		}
		catch(IOException e) {
			System.out.println("Exception during serialization: " + e);
		}
		
		try ( ObjectInputStream objIStrm =
				new ObjectInputStream(new FileInputStream("serial")) )
		{
			ObjectInputFilter myfilter =
					ObjectInputFilter.Config.createFilter("javaIO.Serialization.MyClass;!*");
			objIStrm.setObjectInputFilter(myfilter);
			
			MyClass object2 = (MyClass)objIStrm.readObject();
			System.out.println("object2: " + object2);
		}
		catch(Exception e) {
			System.out.println("Exception during deserialization: " + e);
		}
	}
}
