package de.atslega.arztpraxis.stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");

        stack.pop();
        stack.pop();

        System.out.println(stack.top());
        System.out.println(stack.display());
    }
}
