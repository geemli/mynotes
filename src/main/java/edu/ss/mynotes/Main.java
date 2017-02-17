package edu.ss.mynotes;

/**
 * Created by dznor on 17.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        args = new String[]{"--arg0=qwe", "-arg1=wer", "create", "-arg2=rty"};
        CommandHandler commandHandler = new CommandHandler();
        commandHandler.handle(args);
    }
}
