package com.example.patterns._15_interpreter_pattern._02_after;

import java.util.Map;
import lombok.AllArgsConstructor;

//Terminal Expression
@AllArgsConstructor
public class VariableExpression implements PostfixExpression {

    private Character varialbe;

    @Override
    public int interpret(Map<Character, Integer> context) {
        return context.get(varialbe);
    }
}
