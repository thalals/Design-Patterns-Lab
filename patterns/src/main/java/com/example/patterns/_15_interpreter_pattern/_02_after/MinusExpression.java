package com.example.patterns._15_interpreter_pattern._02_after;

import java.util.Map;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MinusExpression implements PostfixExpression {

    private PostfixExpression left;
    private PostfixExpression right;

    @Override
    public int interpret(Map<Character, Integer> context) {

        return left.interpret(context) - right.interpret(context);
    }
}
