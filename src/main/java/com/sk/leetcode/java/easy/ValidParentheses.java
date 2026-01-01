package com.sk.leetcode.java.easy;
import java.util.Stack;

/**
 * Given a string `s` containing just the characters '(' , ')' , '{' , '}', '[' and ']',
 * determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * 1. Open brackets must be closed by the same type of brackets.
 * 2. Open brackets must be closed in the correct order.
 * 3. Every close bracket has a corresponding open bracket of the same type.
 */

public class ValidParentheses {

    public boolean isValid(String s) {

        if (s == null || s.equalsIgnoreCase("")) {
            return true;
        }

        String[] characters = s.split("");
        if (characters.length % 2 == 1) {
            return false;
        }
        Stack<String> queue = new Stack<>();

        for (int i = 0; i < characters.length; i++) {

            if (characters[i].equalsIgnoreCase("{") || characters[i].equalsIgnoreCase("(") || characters[i].equalsIgnoreCase("[")) {
                queue.push(characters[i]);
                continue;
            }

            if (queue.isEmpty()) {
                return false;
            }

            String polled = queue.pop();

            if (characters[i].equalsIgnoreCase("}") && !polled.equalsIgnoreCase("{")) {
                return false;
            }
            if (characters[i].equalsIgnoreCase("]") && !polled.equalsIgnoreCase("[")) {
                return false;
            }
            if (characters[i].equalsIgnoreCase(")") && !polled.equalsIgnoreCase("(")) {
                return false;
            }

        }

        if (!queue.isEmpty()) {
            return false;
        }

        return true;

    }

    public boolean betterSolution(String s) {

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty() ||
                        (c == ')' && stack.pop() != '(') ||
                        (c == '}' && stack.pop() != '{') ||
                        (c == ']' && stack.pop() != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }


}
