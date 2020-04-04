package stack;

import java.util.Scanner;
import java.util.Stack;

public class Stack01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cntCommand = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= cntCommand; i++) {
            String commandStr = sc.nextLine();
            stackOperator(commandStr, stack);
        }
    }

    private static void stackOperator(String commandStr, Stack<Integer> stack) {
        String[] splitCommand = commandStr.split(" ");

        String stackCommand = splitCommand[0];

        switch (stackCommand) {
            case "push":
                String target = splitCommand[1];
                stack.push(Integer.parseInt(target));
                break;
            case "pop":
                if (stack.empty()) {
                    System.out.println(-1);
                } else {
                    stack.peek();
                    System.out.println(stack.pop());
                }
                break;
            case "empty":
                if (stack.empty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
                break;
            case "size":
                System.out.println(stack.size());
                break;
            case "top":
                if (stack.empty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
        }
    }
}
