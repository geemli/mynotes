package edu.ss.mynotes.command;

import java.util.Map;
import java.util.regex.Pattern;

/**
 * Created by dznor on 17.02.2017.
 */
public class CreateCommand extends Command {

    String name;
    String number;

    public CreateCommand(Map<String, String> map) {
        super(map);
    }

    public void execute(Map<String, String> map) {
        System.out.println("create");
        for (String arg : map.keySet()) {
            arg = arg.toUpperCase();
            if (Pattern.matches("^--", arg)) {
                switch (ECreateOptions.valueOf(arg)) {
                    case NAME:
                        System.out.println("name");
                        break;
                    case NUMBER:
                        System.out.println("number");
                        break;
                    default:
                        System.out.println("default createcommand");
                }
            } else if(Pattern.matches("^-", arg)) {
                switch (EGlobalOptions.valueOf(arg)) {

                }
            }
        }
    }

    enum ECreateOptions {
        NAME("NAME"),
        NUMBER("NUMBER")
        ;

        private final String createOption;

        ECreateOptions(String createOption) {
            this.createOption = createOption;
        }
    }
}
