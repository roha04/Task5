package com.fibonacci;

public class Main {
    public static void main(String[]args){
        System.out.println(FibonacciIterative.fibonacci(5));
        System.out.println(FibonacciRecursive.fibonacci(6));
        System.out.println(FibonacciDP.fibonacci(7));
    }
}
