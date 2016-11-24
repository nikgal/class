package by.galov.fileman;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class TouchCommand extends Command {
    private File file;
    
    public TouchCommand(Map<String, String> args) {
        super(args);
        this.file = new File(args.get("arg1"));
        // TODO Auto-generated constructor stub
    }

    @Override
    public void execute() {
        try {
            file.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // TODO Auto-generated method stub

    }

    @Override
    public void help() {
        // TODO Auto-generated method stub

    }

}
