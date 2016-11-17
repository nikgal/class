package by.galov.lesson2016_11_17;

import java.io.File;
import java.util.Scanner;

public class App {
	/*
	 * 	SOLID
	 * abstract class Command
	 * fields:
	 * -map KV args;
	 * methods:
	 * -execute
	 * -help
	 * 
	 * class Dir
	 * -directory (from App)
	 * System.getProperty("user.dir");
	 * 
	 * class App
	 * -static directory
	 * 
	 * class Date
	 * */
	private static File currentDir = new File(System.getProperty("user.dir"));
	
	private static Command parseCommand(String commandString){
		String[] args = commandString.split(" ");
		switch (args[0]){
		case "dir":
		return new DirCommand(currentDir);
		
		default:
		return null;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String command = sc.nextLine();
		
		while(!command.equals("exit")){ // equals - by symbol  == - by reference
			
			//TODO Define command
			command = sc.nextLine();
			
			Command cmd = parseCommand(command);
			if(cmd != null)
				cmd.execute();
			
		}
		

	}

}
