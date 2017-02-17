package edu.ss.mynotes.command;

/**
 * Created by dznor on 17.02.2017.
 */
public enum EGlobalOptions {
    FILE("FILE"),
    CHARSET("CHARSET")
    ;
    private final String option;

    EGlobalOptions(String option) {
        this.option = option;
    }
}
