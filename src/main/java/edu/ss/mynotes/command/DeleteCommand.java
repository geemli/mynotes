package edu.ss.mynotes.command;

/**
 * Created by dznor on 17.02.2017.
 */
public class DeleteCommand extends Command {
    public DeleteCommand(Map<String, String> map) {
        super(args);
    }

    public void execute(Map<String, String>) {
        System.out.println("delete");
    }
}
