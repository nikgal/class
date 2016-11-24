package by.galov.fileman;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class CatCommand extends Command {
    private File file;
    
    public CatCommand(Map<String, String> args) {
        super(args);
        this.file = new File(args.get("arg1"));
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void execute() {
        String s;
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            while((s=in.readLine()) != null){
                sb.append(s+"\n");
            }
            in.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(sb.toString());
        // TODO Auto-generated method stub
        
    }

    @Override
    public void help() {
        // TODO Auto-generated method stub

    }

}
