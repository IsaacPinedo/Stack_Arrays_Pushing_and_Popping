package com.lesson.lab;

import java.util.Stack;

public class TextEditorUndo {
    private String[] stack;
    private int top;

    // Constructor to initialize the stack and top index
    public TextEditorUndo(int size) {
        // Initialize the stack array by considering an input size.
        stack = new String[size];
        // Set initial top index to -1, meaning it's empty.
        top = -1;
    }

    // Method to add a new action to the stack
    public void push(String action) {
        if (top == stack.length - 1) {
            System.out.println("\nStack is full! Can't push.");
        } else {
            stack[++top] = action;
            System.out.println("\n" + action + " added to the ArrayStack.");
        }
    }
    // Method to remove and return the most recent action from the stack
    public String pop() {
        String poppedAction;
        if (top == -1) {
            System.out.println("\nStack is empty! Can't pop.");
            return null;
        } else {
            poppedAction = stack[top--];
            System.out.println("\nPopped element: " + poppedAction);
        }
        return poppedAction;
    }
    // Method to view the most recent action in the stack without removing it
    public String peek() {
        if (top == -1) {
            System.out.println("\nStack is empty!");
            return null;
        } else {
            return stack[top];
        }
    }

    // Method to display all actions in the stack
    public void display() {
        // Checking if the Stack is empty.
        if (top == -1) {
            System.out.println("\nStack is empty!");
        } else { // Iterating through the stack and printing each action.
            System.out.println("\nActions done: ");
            for (int index = 0; index <= top; index++) {
                System.out.println(stack[index]);
            }
        }
    }
}