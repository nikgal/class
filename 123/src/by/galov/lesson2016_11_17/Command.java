package by.galov.lesson2016_11_17;

import java.util.Map;

public abstract class Command {
	private Map<String, String> argument;
	public abstract void execute();
	public abstract void help();
}
