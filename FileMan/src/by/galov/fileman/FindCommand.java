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
        
        // TODO Auto-generated constructor stub
    }

    @Override
    public void execute() {
        File[] files = file.listFiles();
        boolean fileFound = false;
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
           
        
        // TODO Auto-generated method stub

    }

    @Override
    public void help() {
        System.out.println("find file_name path - search file_name in path");
    }

}
