package com.example.patterns._15_interpreter_pattern._01_before;

import lombok.AllArgsConstructor;

import java.util.Stack;

//후위 표현식
@AllArgsConstructor
public class PostfixNotation {

    private final String expression;

    public static void main(String[] args) {
        // 만약 이런 계산을 자주 한다면?? -> 이럴 때 인터프리터를 고려할 수 있음 ( 일정의 언어, 표현식, 문법으로 만듬)
        PostfixNotation postfixNotation = new PostfixNotation("123+-");
        postfixNotation.calculate();
    }

    private void calculate() {
        Stack<Integer> numbers = new Stack<>();

        for (char c : this.expression.toCharArray()) {
            switch (c) {
                case '+':
                    numbers.push(numbers.pop() + numbers.pop());
                    break;
                case '-':
                    int right = numbers.pop();
                    int left = numbers.pop();
                    numbers.push(left - right);
                    break;
                default:
                    numbers.push(Integer.parseInt(c + ""));
            }
        }

        System.out.println(numbers.pop());
    }
}
