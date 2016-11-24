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
    }

    @Override
    public void execute() {
        if(from.exists()){
            if(!to.exists()){
                System.out.println("Copying "+from.toString()+" to"
                        + " "+to.toString()+"...");
                try {
                    Files.copy(from.toPath(), to.toPath());
                } catch (IOException e) {
                    System.err.println("wrong path");
                }
            }else{
                System.err.println("Target directory is already exists ! ");
            }
        }else{
            System.err.println("Object file doesn't exists!");
        }
    }

    @Override
    public void help() {
        System.out.println("cp path_from path_to - "
                + "copy file from path_from to path_to");
    }

}
