package com.algorithms.practice1.stacks;

public class Stack {

    private int top = -1;
    private int MAX = 5;
    private int[] arr = new int[MAX];

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int item) {
        if (top == MAX - 1) {
            System.out.println("Stack overflow");
//            int[] temp = arr;
//            arr = new int[MAX + 2];
//            System.arraycopy(temp, 0, arr, 0, top + 1);
            return;
        }
        arr[++top] = item;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Underflow");
            return Integer.MIN_VALUE;
        }
        return arr[top--];
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    public int[] getArr() {
        return arr;
    }

    public int getTop() {
        return top;
    }
}
