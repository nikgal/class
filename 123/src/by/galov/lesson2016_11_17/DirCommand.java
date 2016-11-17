package by.galov.lesson2016_11_17;

import java.io.File;
import java.util.Map;

public class DirCommand extends Command {

	private File currentDirectory;
	public DirCommand(File currentDirectory, Map<String, String> args){
		super(args);
		this.currentDirectory = currentDirectory;
	}
	@Override
	public void execute() {
		File[] files = currentDirectory.listFiles();
		for(File file: files){
			System.out.println(file.getAbsolutePath());
		}

	}

	@Override
	public void help() {
		// TODO Auto-generated method stub

	}

}
