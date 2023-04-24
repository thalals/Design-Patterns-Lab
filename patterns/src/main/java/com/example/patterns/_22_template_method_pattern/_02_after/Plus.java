package com.example.patterns._22_template_method_pattern._02_after;

public class Plus extends FileProcessor {

    public Plus(String path) {
        super(path);
    }

    @Override
    protected int getResult(int result, int line) {
        return result += line;
    }
}
