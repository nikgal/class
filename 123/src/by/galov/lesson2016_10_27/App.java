package by.galov.lesson2016_10_27;

import java.io.FileInputStream;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("in.txt"));
		System.out.println(System.in.read());
			
		
	}

}
