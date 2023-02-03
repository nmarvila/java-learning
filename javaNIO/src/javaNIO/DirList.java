package javaNIO;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.NotDirectoryException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList {
	public static void main(String[] args) {
		String dirname = "./";
		
		try ( DirectoryStream<Path> dirstrm =
				Files.newDirectoryStream(Path.of(dirname), "{Path,Dir}*.{java,class}") )
		{
			System.out.println("Directory of " + dirname);
			
			for(Path entry : dirstrm) {
				BasicFileAttributes attribs =
					Files.readAttributes(entry, BasicFileAttributes.class);
				
				if(attribs.isDirectory())
					System.out.print("<DIR> ");
				else
					System.out.print("      ");
				
				System.out.println(entry.getName(1));
			}
		} catch(InvalidPathException e) {
			System.out.println("Path Error " + e);
		} catch(NotDirectoryException e) {
			System.out.println(dirname + " is not a directory.");
		} catch(IOException e) {
			System.out.println("I/O Error: " + e);
		}
	}
}
