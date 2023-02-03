package javaNIO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWrite {
	public static void main(String[] args) {
		try ( FileChannel fChan = (FileChannel)
				Files.newByteChannel(Path.of("test.txt"),
									StandardOpenOption.WRITE,
									StandardOpenOption.CREATE) )
		{
			ByteBuffer mBuf = ByteBuffer.allocate(26);
			for(int h=0; h<3; h++) {
				for(int i=0; i<26; i++)
					mBuf.put((byte)('A' + i));
				
				mBuf.rewind();
				
				fChan.write(mBuf);
				
				mBuf.rewind();
			}
		} catch(InvalidPathException e) {
			System.out.println("Path Error " + e);
		} catch(IOException e) {
			System.out.println("I/O Error: " + e);
			System.exit(1);
		}
	}
}
