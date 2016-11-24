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
            case "cd": 
                return new CdCommand(currentDir, parseArguments(args));
            case "pwd":
                return new PwdCommand(currentDir, parseArguments(args));
            case "cp":
                return new CpCommand(parseArguments(args));
            default:
            return null;
        }
    }
    public static Map<String, String> parseArguments(String[] args){
        Map<String,String> arguments = new HashMap<>();
        for(int i =1;i<args.length;i++){
            arguments.put("arg"+i, args[i]);
        }
        return arguments;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String command;
        
        do{
            System.out.print(currentDir.toString()+" > ");
            //TODO Define command
            command = sc.nextLine();
            
            Command cmd = parseCommand(command);
            if(cmd != null)
                cmd.execute();
            
        }while(!command.equals("exit"));
        
        sc.close();

    }

}
