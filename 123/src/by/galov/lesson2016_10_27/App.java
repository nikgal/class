package by.galov.lesson2016_10_27;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

	public static void main(String[] args) throws IOException {
		String temp = "sadfj";
		temp = "asdf";
		
		String temp3 = "j" + temp.substring(1, temp.length() );
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("afsdf");
		buffer.append("asasdfdf");
		
		buffer.setCharAt(0, 'g');
		
		System.out.println(buffer);
		
		//StringBuilder
		
		//search
		
		for(int i = 0;i < buffer.length();i++){
			char c = buffer.charAt(i);
			if (c=='f'){
				System.out.println("fff");
			}
		}
		
		//regular expression
		
		Pattern pattern = Pattern.compile("[0-9]+");
		
		Matcher mat = pattern.matcher(" 234 213 1234 23 2 412 23");
		
		System.out.println(mat.matches());
		
		System.out.println(mat.find());
		System.out.println(mat.group());
		
		while (mat.find()){
			System.out.println(mat.group());
			System.out.println(mat.start());
			System.out.println(mat.end());

			
		}
		
		String s = mat.replaceAll("number");
		System.out.println(s);
	}

}
