package by.galov.lesson2016_10_27;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("in.txt");
		Scanner sc = new Scanner(is);
		while(sc.hasNext()){
			System.out.println(sc.nextLine());
		}
			
		
	}

}
