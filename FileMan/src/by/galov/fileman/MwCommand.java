package by.galov.fileman;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Map;

public class MwCommand extends Command {
    
    private File from, to;
    
    public MwCommand(Map<String, String> args) {
        super(args);
        this.from = new File(args.get("arg1"));
        this.to = new File(args.get("arg2"));
        // TODO Auto-generated constructor stub
    }

    @Override
    public void execute() {
        System.out.println("Moving from"+from.toString()+" to "+to.toString());
        try {
            Files.move(from.toPath(), to.toPath());
        } catch (IOException e) {
            System.err.println("wrong path");
        }
    }

    @Override
    public void help() {
        System.out.println("mw path1 path2 - movw file from path1 to path2");

    }

}
