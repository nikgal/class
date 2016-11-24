package by.galov.fileman;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Map;

public class CpCommand extends Command {

    private File from, to;
    public CpCommand(Map<String, String> args) {
        super(args);
        this.from = new File(args.get("arg1"));
        this.to = new File(args.get("arg2"));
        // TODO Auto-generated constructor stub
    }

    @Override
    public void execute() {
        System.out.println("Copying "+from.toString()+" "+to.toString());
        try {
            Files.copy(from.toPath(), to.toPath());
        } catch (IOException e) {
            System.err.println("wrong path");
        }
        // TODO Auto-generated method stub

    }

    @Override
    public void help() {
        // TODO Auto-generated method stub

    }

}
