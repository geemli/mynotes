package edu.ss.mynotes.command;

/**
 * Created by dznor on 17.02.2017.
 */
public class ReadCommand extends Command {
    public ReadCommand(Map<String, String>) {
        super(args);
    }

    public void execute(Map<String, String>) {
        System.out.println("read");
    }
}
