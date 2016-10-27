package by.galov.lesson2016_10_27;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		File file = new File("input.txt");
		System.out.println(file.exists());
		FileOutputStream fs;
		try {
			fs = new FileOutputStream(file);
			fs.write(128);
			for(int i=0;i<256;i++){
				fs.write(i);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileReader reader = new FileReader("in.txt");
			int c;
			do{
				c=reader.read();
				if (c>-1){
					System.out.print((char)c);
				}
			}while(c != -1);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		try {
			boolean created = file.createNewFile();
			if(created){
				System.out.println("File was created");
			}
		}catch(SecurityException se){
			System.out.println("acces dinyed");
		} catch (IOException e) {
			System.out.println("unknown error");
		}
	}

}
