package by.galov.lesson2016_11_17;

import java.io.File;
import java.util.Map;

public class CdCommand extends Command {

	
	public CdCommand(File currentDirectory, Map<String, String> args){
		super(args);
		
	}
	
	@Override
	public void execute() {
		String newDir = argument.get("arg1");
		if (newDir == null){
			System.err.println("Select dir!");
		} else{
			File file = new File(newDir);
			if (!file.isDirectory()){
				System.err.println("Select dir! ");
			} else{
				App.currentDir = file;
			}
		}

	}

	@Override
	public void help() {
		// TODO Auto-generated method stub

	}

}
