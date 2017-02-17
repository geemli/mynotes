package edu.ss.mynotes;

import edu.ss.mynotes.command.*;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * Created by dznor on 17.02.2017.
 */
public class CommandHandler {

    Command command;
    Map<String, String> options = new HashMap<>();

    public void handle(String[] args) {

        for (String arg : args) {
            if (Pattern.matches("^(\\w+)$", arg)) {
                arg = arg.toUpperCase();
                switch (ECommand.valueOf(arg)) {
                    case CREATE:
                        if (command == null) {
                            command = new CreateCommand(options);
                        } else {
                            throw new IllegalArgumentException("TOO MANY COMMANDS");
                        }
                        break;
                    case READ:
                        if (command == null) {
                            command = new ReadCommand(options);
                        } else {
                            throw new IllegalArgumentException("TOO MANY COMMANDS");
                        }
                        break;
                    case UPDATE:
                        if (command == null) {
                            command = new UpdateCommand(options);
                        } else {
                            throw new IllegalArgumentException("TOO MANY COMMANDS");
                        }
                        break;
                    case DELETE:
                        if (command == null) {
                            command = new DeleteCommand(options);
                        } else {
                            throw new IllegalArgumentException("TOO MANY COMMANDS");
                        }
                        break;
                    default:
                        System.out.println("beda");
                        break;
                }
            }

//        for(String arg: args) {
//            if(Pattern.matches("^-{1}([a-z0-9-]+=[a-z0-9-]+)", arg)) {
//                System.out.println(arg + "GlobalOption");
//                command.add(GlobalOption.valueOf(arg));
//            } else if("^-[a-z0-9-]+=[a-z0-9-]+$"){
//                System.out.println(arg + "LocalOption");
//                    command.add(LocalOption.valueOf(arg));
//            } else if (Pattern.matches("^\\w+$", arg)){
//                System.out.println(arg + "Method");
//                command.add(Method.valueOf(arg));
//            } else {
//                throw new IllegalArgumentException("Unknown parameter");
//            }
        }

        if (command == null) {
            throw new IllegalArgumentException("no commands");
        }
        command.execute(args);
    }

    enum ECommand {
        CREATE("CREATE"),
        READ("READ"),
        UPDATE("UPDATE"),
        DELETE("DELETE");

        private final String command;

        ECommand(String command) {
            this.command = command;
        }
    }

}


