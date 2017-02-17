package edu.ss.mynotes.command;

import java.util.Map;

/**
 * Created by dznor on 17.02.2017.
 */
public abstract class Command {
    Map<String, String> map;

    abstract public void execute(Map<String, String> map);

    public Command(Map<String, String> map) {
        this.map = map;
    }
}
