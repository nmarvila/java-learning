package networking;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpURLDemo {
	public static void main(String[] args) throws Exception {
		URL hp = new URL("http://www.google.com");
		
		HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();
		
		System.out.println("Request method is " +
							hpCon.getRequestMethod());
		
		System.out.println("Response code is " +
							hpCon.getResponseCode());
		
		System.out.println("Response Message is " +
							hpCon.getResponseMessage());
		
		Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
		Set<String> hdrField = hdrMap.keySet();
		
		System.out.println("\nHere is the header:");
		
		for(String k : hdrField) {
			System.out.println("Key: " + k +
								" Value: " + hdrMap.get(k));
		}
	}
}
