package com.example.patterns._14_command_pattern._03_after_undo;

/**
 *  Runnable 유사
 */

public interface Command {

    void execute();

    void undo();
}
