package by.galov.lesson2016_11_17;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
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
		return new DirCommand(currentDir,parseArguments(String[] args));
		
		default:
		return null;
		}
	}
	private static Map<String, String> parseArguments(String[] args){
		Map<String,String> arguments = new HashMap<>();
		for(int i =1;i<args.length;i++){
			arguments.put("arg"+i, args[i]);
		}
		return arguments;
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
