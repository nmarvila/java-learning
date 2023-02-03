package networking;

import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpClientDemo {
	public static void main(String[] args) throws Exception {
		HttpClient myHC = HttpClient.newHttpClient();
		
		HttpRequest myReq = HttpRequest.newBuilder(
								new URI("http://www.google.com/")).build();
		
		HttpResponse<String> myResp = myHC.send(myReq,
								HttpResponse.BodyHandlers.ofString());
		
		System.out.println("Response code is " + myResp.statusCode());
		System.out.println("Request method is " + myReq.method());
		
		HttpHeaders hdrs = myResp.headers();
		
		Map<String, List<String>> hdrMap = hdrs.map();
		Set<String> hdrField = hdrMap.keySet();
		
		System.out.println("\nHere is the header:");
		
		for(String k : hdrField) {
			System.out.println("Key: " + k +
								"  Value: " + hdrMap.get(k));
		}
		
		System.out.println("\nHere is the body: ");
		
		System.out.println(myResp.body());
	}
}
