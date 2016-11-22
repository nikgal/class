package by.galov.lesson2016_11_17;

import java.util.Map;

public abstract class Command {
	protected Map<String, String> argument;
	public Command(Map<String, String> args) {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void execute();
	public abstract void help();
}
