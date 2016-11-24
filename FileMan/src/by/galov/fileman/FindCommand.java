package by.galov.fileman;

import java.io.File;
import java.util.Map;

public class FindCommand extends Command {
    private File file;
    private String find;
    public FindCommand(Map<String, String> args) {
        super(args);
        this.find = args.get("arg1");
        this.file = new File(args.get("arg2"));
    }

    @Override
    public void execute() {
        File[] files = file.listFiles();
        boolean fileFound = false;
        if(file.isDirectory()){
            for(File file: files){
                if (file.getName().equals(find)){
                    System.out.println("file was found: "+ file.getAbsolutePath());
                    fileFound = true;
                    break;
                }
            }
           
            if(!fileFound){
                System.out.println("file not found! in "+ file);
            }
        }else{
            System.err.println("Incorrect dir!");
        }
    }

    @Override
    public void help() {
        System.out.println("find file_name path - search file_name in path");
    }

}
