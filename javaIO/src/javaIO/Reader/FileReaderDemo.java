package javaIO.Reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) {
		try ( FileReader fr = new FileReader("src/javaIO/Reader/FileReaderDemo.java") )
		{
			int c;
			
			while((c = fr.read()) != -1) System.out.print((char) c);
		} catch(IOException e) {
			System.out.println("I/O Error: " + e);
		}
	}
}
