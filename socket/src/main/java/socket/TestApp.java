package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
		URL url = new URL("http://vk.com");
		
		InputStream is = url.openStream();
		
		Reader r = new InputStreamReader(is);
		
		char[] b = new char[256];
		int count = -1;
		
		while((count = r.read(b)) > 0){
			for(int i = 0; i < count; i++){
				System.out.print(b[i]);
			}
		}
	}

}
