package com.example.patterns._22_template_method_pattern._02_after;

public class Minus extends FileProcessor {

    public Minus(String path) {
        super(path);
    }

    @Override
    protected int getResult(int result, int line) {
        return result -= line;
    }

}
