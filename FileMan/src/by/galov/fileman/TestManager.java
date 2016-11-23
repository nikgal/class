package by.galov.fileman;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestManager {
    
    static File currentDir = new File(System.getProperty("user.dir"));
    
    private static Command parseCommand(String commandString){
        String[] args = commandString.split(" ");
        switch (args[0]){
            case "dir":
            return new DirCommand(currentDir,parseArguments(args));
            case "cd": return new CdCommand(currentDir, parseArguments(args));
            default:
            return null;
        }
    }
    private static Map<String, String> parseArguments(String[] args){
        Map<String,String> arguments = new HashMap<>();
        for(int i =1;i<args.length;i++){
            arguments.put("arg"+i, args[i]);
        }
        return arguments;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        
        while(!command.equals("exit")){ // equals - by symbol  == - by reference
            
            //TODO Define command
            command = sc.nextLine();
            
            Command cmd = parseCommand(command);
            if(cmd != null)
                cmd.execute();
            
        }

    }

}
