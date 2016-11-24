package by.galov.fileman;

import java.io.File;
import java.util.Map;

public class PwdCommand extends Command {
    private File file;
    public PwdCommand(File currentDir, Map<String, String> args) {
        super(args);
        this.file = currentDir;
    }

    @Override
    public void execute() {
        System.out.println(file.toString());
    }

    @Override
    public void help() {
        System.out.println("pwd - show current dir");

    }

}
