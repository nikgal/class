package by.galov.fileman;

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
                System.err.println("Wrong dir! ");
            } else{
                TestManager.currentDir = file;
            }
        }

    }

    @Override
    public void help() {
        System.out.println("cd direct - change directory");

    }


}
