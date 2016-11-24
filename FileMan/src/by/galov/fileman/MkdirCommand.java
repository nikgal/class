package by.galov.fileman;

import java.io.File;
import java.util.Map;

public class MkdirCommand extends Command {
    private File file;
    public MkdirCommand(Map<String, String> args) {
        super(args);
        this.file =new File(args.get("arg1"));
        // TODO Auto-generated constructor stub
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        file.mkdir();

    }

    @Override
    public void help() {
        // TODO Auto-generated method stub

    }

}
