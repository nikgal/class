package by.galov.fileman;

import java.util.Date;
import java.util.Map;

public class DateCommand extends Command {

    public DateCommand(Map<String, String> args) {
        super(args);
        // TODO Auto-generated constructor stub
    }

    public DateCommand() {
        super(null);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void execute() {
        Date now = new Date();
        // TODO Auto-generated method stub
        System.out.println(now.toString());
    }

    @Override
    public void help() {
        
        System.out.println("date - current date");
    }

}
