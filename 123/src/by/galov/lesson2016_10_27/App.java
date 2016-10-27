package by.galov.lesson2016_10_27;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws IOException {
		//InputStream is = new FileInputStream("in.txt");
		URL url = new URL("http://vk.com");
		Scanner sc = new Scanner(new BufferedInputStream(url.openStream()));
		while(sc.hasNext()){
			System.out.println(sc.nextLine());
		}
			
		
	}

}
