package by.galov.fileman;

import java.io.File;
import java.util.Map;

public class MkdirCommand extends Command {
    private File file;
    public MkdirCommand(Map<String, String> args) {
        super(args);
        this.file =new File(args.get("arg1"));
    }

    @Override
    public void execute() {
        if(file.mkdir()){
            System.out.println(file.getAbsolutePath()+" was created !");
        }else{
            System.err.println("it is not directory");
        }

    }

    @Override
    public void help() {
        System.out.println("mkdir path - create directory in path");

    }

}
