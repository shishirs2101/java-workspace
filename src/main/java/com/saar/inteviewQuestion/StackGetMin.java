package com.saar.inteviewQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackGetMin {
    final static Stack<Integer> stack = new Stack<>();
    final static Stack<Integer> tempStack = new Stack<>();

    public static void main(String[] args) {
        push(4);
        push(5);
        push(1);
        push(10);
        push(3);
        display();
        System.out.println(getMin());
        pop();
        pop();
        System.out.println(getMin());
        display();
        pop();
        display();
        push(2);
        display();
        System.out.println(getMin());
    }

    public static void push(int n) {
        stack.push(n);
        if (tempStack.isEmpty()) {
            tempStack.push(n);
        } else {
            Integer pop = tempStack.pop();
            tempStack.push(pop);
            if (n > pop) tempStack.push(pop);
            else {
                tempStack.push(n);
            }
        }
    }

    public static int pop() {
        tempStack.pop();
        return stack.pop();
    }

    public static int getMin() {
        return tempStack.lastElement();

    }

    public static void display() {
        System.out.println("stack " + stack.toString());
        System.out.println("temp stack " + tempStack.toString());
    }
}
