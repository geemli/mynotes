package edu.ss.mynotes.command;

/**
 * Created by dznor on 17.02.2017.
 */
public class UpdateCommand extends Command {

    public UpdateCommand(Map<String, String>) {
        super(args);
    }

    public void execute(Map<String, String>) {
        System.out.println("update");
    }
}
